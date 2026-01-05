package com.dao;

import com.model.User;
import java.util.List;

public interface UserDAO {

    boolean registerUser(User user);

    User login(String email, String password);

    List<User> findMatches(User user);
    boolean updateUser(User user);
    boolean deleteUser(String email);

}
