package com.ly.mybatisdemo.controller;

import com.ly.mybatisdemo.model.User;
import com.ly.mybatisdemo.model.UserDetail;
import com.ly.mybatisdemo.service.IUserService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by lyc28724 on 2016/9/10.
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private IUserService userService;
    
    static Logger log = Logger.getLogger(UserController.class);

    @RequestMapping("user")
    public String findAllUserInfo(Model model) {
        List<User> userList = userService.findAllUser();
        model.addAttribute("userList", userList);
        log.info("test info level log!!");
        log.debug("test debug level log!!");
        return "user";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addUserInfo(User user) {
        userService.addUser(user);
        return "redirect:user";
    }

    @RequestMapping(value = "query", method = RequestMethod.POST)
    public String queryUserInfo(User user, Model model) {
        List<User> userList = userService.queryUser(user);
        model.addAttribute("userList", userList);
        model.addAttribute("queryUser", user);
        return "user";
    }

    @RequestMapping(value = "search", method = RequestMethod.POST)
    public String searchUserInfo(User user, Model model) {
        List<User> userList = userService.searchUser(user);
        model.addAttribute("userList", userList);
        model.addAttribute("searchUser", user);
        return "user";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String searchUserInfo(Integer userId) {
        userService.deleteUser(userId);
        return "redirect:user";
    }

    @RequestMapping(value = "load-edit", method = RequestMethod.POST)
    public String loadEditUserInfo(Integer userId, Model model) {
        User user = userService.loadEditUser(userId);
        model.addAttribute("user", user);
        return "userEdit";
    }

    @RequestMapping(value = "post-edit", method = RequestMethod.POST)
    public String postEditUserInfo(User user) {
        userService.postEditUser(user);
        return "redirect:user";
    }

    @RequestMapping(value = "query-cities", method = RequestMethod.POST)
    public String queryCities(String travelCities, Model model) {
        String[] cityList = travelCities.split("、");
        List<User> userList = userService.queryUserByCities(cityList);
        model.addAttribute("cityList", travelCities);
        model.addAttribute("userList", userList);
        return "user";
    }

    @RequestMapping(value = "getUserDetail", method = RequestMethod.POST)
    public String getUserDetail(Integer userId, Model model) {
        UserDetail userDetail = userService.getUserDetail(userId);
        model.addAttribute("userDetail", userDetail);
        return "userDetail";
    }
}
