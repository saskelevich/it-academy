package by.itacademy.java.yaskelevich.home.practic7.datalayer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbstractDBDao {

    private static final String PASSWORD = "Lfnf<fpf";
    private static final String USER = "saskel";
    private static final String LOCALHOST = "jdbc:postgresql://localhost:5432/MyFirstDB";
    protected static final String UPDATED = "updated";
    protected static final String CREATED = "created";
    protected static final String ID = "id";

    protected static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(LOCALHOST, USER, PASSWORD);
    }
}