package cn.jp51.ssm.dao;


import java.util.List;

import cn.jp51.ssm.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-dao.xml")
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testQueryAll() {
        List<User> list = userDao.queryAll(1, 2);
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    public void testQuery() {
        List<User> list=userDao.query();
        for (User user : list) {
            System.out.println(user);
        }
    }

}
