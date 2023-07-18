package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // реализуйте алгоритм здесь
        Class.forName("com.mysql.cj.jdbc.Driver");
       // Util.statement.execute("create database training_db;");
        UserDaoJDBCImpl udji = new UserDaoJDBCImpl();
        udji.createUsersTable();
        udji.saveUser("JEZHEG", "HISCHNICK", (byte)(12));
        udji.saveUser("PONCHICK", "UBERKATZER", (byte)(6));
        udji.saveUser("ALEX", "SPIDER", (byte)(23));
        udji.saveUser("TORSCHER", "EAGLEOWL", (byte)(40));
        udji.cleanUsersTable();
        udji.dropUsersTable();
    }
}
