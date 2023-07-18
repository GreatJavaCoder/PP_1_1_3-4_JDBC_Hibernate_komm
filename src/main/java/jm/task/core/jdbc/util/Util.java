package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    // реализуйте настройку соединения с БД
    public static final String url = "jdbc:mysql://localhost:3306/training_db";
    public static final String user = "root";
    public static final String pass = "boss1949";

    public static Statement statement;
    public static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException t) {
            t.printStackTrace();
            throw new RuntimeException();
        }
    }

    static {
        try {
            statement = connection.createStatement();
        } catch (SQLException t) {
            t.printStackTrace();
            throw new RuntimeException();
        }
    }
}
