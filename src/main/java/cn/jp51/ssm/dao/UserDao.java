package cn.jp51.ssm.dao;

import cn.jp51.ssm.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
//    List<User> queryAll(int offset,int limit);
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);
    List<User> query();

}