package com.ly.mybatisdemo.service;

import com.ly.mybatisdemo.model.User;
import com.ly.mybatisdemo.model.UserDetail;

import java.util.List;

/**
 * Created by lyc28724 on 2016/9/10s.
 */
public interface IUserService{

    List<User> findAllUser();

    Integer addUser(User user);

    List<User> queryUser(User user);

    List<User> searchUser(User user);

    Integer deleteUser(Integer userId);

    User loadEditUser(Integer userId);

    Integer postEditUser(User user);

    List<User> queryUserByCities(String[] cityList);

    UserDetail getUserDetail(Integer userId);
}
