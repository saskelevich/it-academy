package by.itacademy.java.yaskelevich.classroom.lesson26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
    public static void main(final String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "saskel-cars",
                "1");) {

            final Statement statement = connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("SELECT * FROM car");
            while (resultSet.next()) {
                System.out.printf("%s|%s|%s\n", resultSet.getInt("id"), resultSet.getString("vin"),
                        resultSet.getDate("created"));
            }
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }
}
