package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;
import jm.task.core.jdbc.util.Util;

public class UserServiceImpl implements UserService {
    private UserDaoJDBCImpl udji = new UserDaoJDBCImpl();
    //private UserDaoHibernateImpl udhi = new UserDaoHibernateImpl();

    @Override
    public void createUsersTable() throws SQLException {
        udji.createUsersTable();
        //udhi.createUsersTable();
    }

    @Override
    public void dropUsersTable() throws SQLException {
        udji.dropUsersTable();
        //udhi.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) throws SQLException {
        udji.saveUser(name, lastName, age);
        //udhi.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        udji.removeUserById(id);
        //udhi.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return /*udhi.getAllUsers();*/ udji.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        udji.cleanUsersTable();
        //udhi.cleanUsersTable();
    }
}
