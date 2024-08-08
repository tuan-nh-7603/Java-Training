package org.example.transaction.dao;


import org.example.transaction.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public User findById(int id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }
}
