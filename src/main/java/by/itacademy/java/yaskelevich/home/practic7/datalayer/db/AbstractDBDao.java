package by.itacademy.java.yaskelevich.home.practic7.datalayer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbstractDBDao {

    private static final String PASSWORD = "1";
    private static final String USER = "postgres";
    private static final String LOCALHOST = "jdbc:postgresql://localhost:5432/saskel-cars";
    protected static final String UPDATED = "updated";
    protected static final String CREATED = "created";
    protected static final String ID = "id";

    protected Connection createConnection() throws SQLException {
        return DriverManager.getConnection(LOCALHOST, USER, PASSWORD);
    }
}