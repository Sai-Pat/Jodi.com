package com.service;

import com.dao.UserDAO;
import com.dao.UserDAOImpl;
import com.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDAO dao = new UserDAOImpl();
    @Override
public boolean updateUser(User user) {
    return dao.updateUser(user);
}

@Override
public boolean deleteUser(String email) {
    return dao.deleteUser(email);
}


    public boolean registerUser(User user) {
        return dao.registerUser(user);
    }

    public User login(String email, String password) {
        return dao.login(email, password);
    }

    public List<User> findMatches(User user) {
        return dao.findMatches(user);
    }
}
