package com.openallzzz.dao;

import com.openallzzz.entity.User;

import java.util.List;

public interface UserDao {
    int update(String id, User user); // 修改
    int delete(String id); // 通过id删除一个用户
    User findById(String id); // 通过id查询出一个用户
    int[] batchInsert(List<Object[]> users); // 批量插入
}
