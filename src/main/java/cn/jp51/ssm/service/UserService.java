package cn.jp51.ssm.service;

import cn.jp51.ssm.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList(int offset, int limit);
}
