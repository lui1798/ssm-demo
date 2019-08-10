package cn.jp51.ssm.web;

import cn.jp51.ssm.entity.User;
import cn.jp51.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public String list(int offset, int limit) {
        List<User> userList = userService.getUserList(1, 10);
        return "userList";
    }

}