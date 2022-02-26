package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void createUsersTable();
    void dropUsersTable();
    void addUser(User user);
    void removeUser(User user);
    List<User> getAllUsers();
    void cleanUsersTable();

}
