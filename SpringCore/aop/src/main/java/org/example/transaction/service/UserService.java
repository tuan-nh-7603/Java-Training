package org.example.transaction.service;

import org.example.transaction.dao.UserDAO;
import org.example.transaction.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public void createUser(User user) {
        userDAO.save(user);
    }

    public User getUser(int id) {
        return userDAO.findById(id);
    }
}
