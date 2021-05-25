package com.szh.springboot.service;

import com.szh.springboot.domain.User;

import java.util.List;

/**
 *
 */
public interface UserService {

    User queryUserByName(String username);

    List<User> queryAllUser();

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Integer userId);
}
