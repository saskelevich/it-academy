package by.itacademy.java.yaskelevich.classroom.lessons13.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2 {
    private static final Random RND = new Random();

    private static class Employee {
        private final int age;
        private final List<Employee> subordinates = new ArrayList<>();

        public Employee() {
            super();
            this.age = RND.nextInt(40) + 20;
        }

        public int getAge() {
            return age;
        }

        public List<Employee> getSubordinates() {
            return subordinates;
        }

        @Override
        public String toString() {
            return "Employee [age=" + age + "]";
        }

    }

    private static class AverageAgeResult {
        private int quantity;
        private int totalAge;

        private int getAverageAge() {
            return totalAge / quantity;
        }

        @Override
        public String toString() {
            return "AverageAgeResult [quantity=" + quantity + ", totalAge=" + totalAge + ", getAverageAge()="
                    + getAverageAge() + "]";
        }

        public void add(final Employee employee) {
            this.totalAge += employee.getAge();
            this.quantity++;
        }
    }

    public static void main(final String[] args) {
        final List<Employee> roots = buildNode(0, null);

        final AverageAgeResult result = calculateAverageAge(roots, new AverageAgeResult());
        System.out.println(result);

    }

    private static List<Employee> buildNode(final int level, final Employee parent) {

        final List<Employee> nodes = new ArrayList<>();
        if (level >= 5) {
            return nodes;
        }
        final int nodesQuantity = RND.nextInt(5);
        for (int i = 0; i < nodesQuantity; i++) {
            final Employee employee = new Employee();
            nodes.add(employee);

            printNode(employee, level);

            if (parent != null) {
                parent.getSubordinates().add(employee);
            }
            buildNode(level + 1, employee);
        }
        return nodes;
    }

    private static void printNode(final Employee employee, final int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(employee);
    }

    private static AverageAgeResult calculateAverageAge(final List<Employee> roots, final AverageAgeResult result) {
        for (final Employee employee : roots) {
            result.add(employee);
            calculateAverageAge(employee.getSubordinates(), result);
        }
        return result;
    }
}
