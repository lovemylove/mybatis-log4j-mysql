package com.ly.mybatisdemo.service.impl;

import com.ly.mybatisdemo.dao.IUserDao;
import com.ly.mybatisdemo.model.User;
import com.ly.mybatisdemo.model.UserDetail;
import com.ly.mybatisdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lyc28724 on 2016/9/10.
 */
@Service("userService")
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public Integer addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public List<User> queryUser(User user) {
        return userDao.queryUser(user);
    }

    @Override
    public List<User> searchUser(User user) {
        return userDao.searchUser(user);
    }

    @Override
    public Integer deleteUser(Integer userId) {
        return userDao.deleteUser(userId);
    }

    @Override
    public User loadEditUser(Integer userId) {
        return userDao.loadEditUser(userId);
    }

    @Override
    public Integer postEditUser(User user) {
        return userDao.postEditUser(user);
    }

    @Override
    public List<User> queryUserByCities(String[] travelCities) {
        return userDao.queryUserByCities(travelCities);
    }

    @Override
    public UserDetail getUserDetail(Integer userId) {
        return userDao.getUserDetail(userId);
    }
}
