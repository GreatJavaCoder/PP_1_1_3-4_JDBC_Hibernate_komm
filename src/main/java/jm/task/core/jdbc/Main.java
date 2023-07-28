package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // реализуйте алгоритм здесь
        Class.forName("com.mysql.cj.jdbc.Driver");
        UserDaoHibernateImpl udhi = new UserDaoHibernateImpl();
        udhi.createUsersTable();
        udhi.saveUser("HRE", "IOS", (byte)(3));
        udhi.saveUser("INI", "EFH", (byte)(1));
        udhi.saveUser("BAS", "CFI", (byte)(4));
        udhi.saveUser("ETP", "ENT", (byte)(1));
        udhi.cleanUsersTable();
        udhi.dropUsersTable();
    }
}
