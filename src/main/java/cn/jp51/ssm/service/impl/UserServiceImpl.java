package cn.jp51.ssm.service.impl;

import cn.jp51.ssm.dao.UserDao;
import cn.jp51.ssm.entity.User;
import cn.jp51.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserDao userDao;


    @Override
    public List<User> getUserList(int offset, int limit) {
        List<User> userList = userDao.queryAll(offset, limit);
        return userList;
    }


}
