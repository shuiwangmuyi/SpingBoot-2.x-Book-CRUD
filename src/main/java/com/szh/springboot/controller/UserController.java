package com.szh.springboot.controller;

import com.szh.springboot.domain.User;
import com.szh.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String queryUserByName(String username, String password, Model model, HttpSession session) {
        User user=userService.queryUserByName(username);
        if(user!=null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
            session.setAttribute("msg","登录成功");
            return "redirect:/book/home";
        }else {
            model.addAttribute("loginMsg","用户名或密码错误");
            return "index";
        }
    }

    @RequestMapping(value = "/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping(value = "/register")
    public String register(User user,Model model) {
        List<User> userList=userService.queryAllUser();
        for(User user1 : userList) {
            if(user1.getUsername().equals(user.getUsername())) {
                model.addAttribute("registerMsg","该账号已存在");
                return "register";
            }
        }
        userService.addUser(user);
        return "index";
    }

    @RequestMapping(value = "/logout")
    public String logout() {
        return "redirect:/user/login";
    }
}
