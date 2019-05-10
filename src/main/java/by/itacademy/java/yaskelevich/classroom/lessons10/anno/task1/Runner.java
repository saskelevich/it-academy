package by.itacademy.java.yaskelevich.classroom.lessons10.anno.task1;

public class Runner {
    public static void main(final String[] args) {
        printClassVersion(new Sample1());
        printClassVersion(new Sample2());
        printClassVersion(new Sample3());
        printClassVersion(new Object());
        printClassVersion(new String());
    }

    static void printClassVersion(final Object o) {
        final Version versionMetadata = o.getClass().getAnnotation(Version.class);

        System.out.printf("obeject %s version=%s\n", o.hashCode(),
                versionMetadata == null ? "not specified" : versionMetadata.versionNumber());
    }
}
