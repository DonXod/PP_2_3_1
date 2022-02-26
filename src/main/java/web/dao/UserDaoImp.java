package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void removeUser(long id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public void cleanUsersTable() {
        entityManager.createQuery("delete from User").executeUpdate();
    }

    @Override
    public void updateUser(User user) {
        User persistanceUser = getUserById(user.getId());
        persistanceUser.setName(user.getName());
        persistanceUser.setLastName(user.getLastName());
    }

    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }


}
