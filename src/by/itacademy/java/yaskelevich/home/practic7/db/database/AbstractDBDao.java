package by.itacademy.java.yaskelevich.home.practic7.db.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDBDao {

    protected Connection createConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/dz-cars", "postgres", "postgres");

    }
}
