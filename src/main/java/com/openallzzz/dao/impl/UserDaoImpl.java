package com.openallzzz.dao.impl;

import com.openallzzz.dao.UserDao;
import com.openallzzz.entity.User;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate template;

    @Override
    public int update(String id, User user) {
        String sql = "update user set id = ?, name = ?, sex = ?, classno = ?, age = ? where id = ?";
        return template.update(sql, user.getId(), user.getName(),
                user.getSex(), user.getClassno(), user.getAge(), id);
    }

    @Override
    public int delete(String id) {
        String sql = "delete from user where id = ?";
        return template.update(sql, id);
    }

    @Override
    public User findById(String id) {
        String sql = "select * from user where id = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
    }

    @Override
    public int[] batchInsert(List<Object[]> users) {
        String sql = "insert into user values(?, ?, ?, ?, ?)";
        return template.batchUpdate(sql, users);
    }
}
