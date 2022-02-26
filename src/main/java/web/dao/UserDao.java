package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void createUsersTable();
    void dropUsersTable();
    void addUser(User user);
    void removeUser(User user);
    List<User> getAllUsers();
    void cleanUsersTable();
}
