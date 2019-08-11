package cn.jp51.ssm.web;

import cn.jp51.ssm.entity.User;
import cn.jp51.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String list(Model model) {
        LOG.info("invoke----------/user/list");
        List<User> userList = userService.getUserList(1, 10);
        System.out.println(userList);
//        ModelAndView view = new ModelAndView();
//        view.addObject("userList", userList);
//        view.setViewName("userList");
        model.addAttribute("userlist", userList);
        return "userlist";
    }

}