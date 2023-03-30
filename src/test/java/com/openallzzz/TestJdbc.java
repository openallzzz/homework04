package com.openallzzz;

import com.openallzzz.entity.User;
import com.openallzzz.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestJdbc {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void testAll() {
//        List<Object[]> infos = new ArrayList<>();
//        infos.add(new Object[]{"001", "aaa", "f", "3", 22});
//        infos.add(new Object[]{"002", "bbb", "f", "3", 22});
//        infos.add(new Object[]{"003", "ccc", "f", "3", 22});
//        infos.add(new Object[]{"004", "ddd", "f", "3", 22});
//        infos.add(new Object[]{"005", "eee", "f", "3", 22});
//        infos.add(new Object[]{"006", "fff", "f", "3", 22});
//
//        int[] res = userService.batchAddUser(infos);
//        for(int x : res) {
//            System.out.println(x);
//        }

//        User user = new User("420109070226", "张宇", "男", "4201090503", 21);
//        int res = userService.updateUserById("001", user);
//        System.out.println(res);

//        int res = userService.deleteUserById("005");
//        System.out.println(res);

        User user = userService.getUserById("420109070226");
        System.out.println(user);
    }

}
