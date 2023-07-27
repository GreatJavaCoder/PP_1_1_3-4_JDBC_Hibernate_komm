package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // реализуйте алгоритм здесь
        Class.forName("com.mysql.cj.jdbc.Driver");
        UserDaoJDBCImpl udji = new UserDaoJDBCImpl();
        udji.createUsersTable();
        udji.saveUser("ABC", "DEF", (byte)(1));
        udji.saveUser("GHI", "JKL", (byte)(2));
        udji.saveUser("MNO", "PQR", (byte)(3));
        udji.saveUser("STU", "VWX", (byte)(4));
        udji.cleanUsersTable();
        udji.dropUsersTable();
    }
}
