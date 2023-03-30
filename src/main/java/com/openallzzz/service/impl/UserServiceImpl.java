package com.openallzzz.service.impl;

import com.openallzzz.dao.impl.UserDaoImpl;
import com.openallzzz.entity.User;
import com.openallzzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoImpl userDao;

    @Override
    public int[] batchAddUser(List<Object[]> infos) {
         return userDao.batchInsert(infos);
    }

    @Override
    public int updateUserById(String id, User user) {
        return userDao.update(id, user);
    }

    @Override
    public int deleteUserById(String id) {
        return userDao.delete(id);
    }

    @Override
    public User getUserById(String id) {
        return userDao.findById(id);
    }
}
