package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    void removeUser(long id);
    List<User> getAllUsers();
    void cleanUsersTable();
    void updateUser(User user);
    User getUserById(long id);

}
