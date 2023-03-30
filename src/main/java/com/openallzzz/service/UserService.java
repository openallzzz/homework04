package com.openallzzz.service;

import com.openallzzz.entity.User;

import java.util.List;

public interface UserService {
    int[] batchAddUser(List<Object[]> infos);
    int updateUserById(String id, User user);
    int deleteUserById(String id);
    User getUserById(String id);
}
