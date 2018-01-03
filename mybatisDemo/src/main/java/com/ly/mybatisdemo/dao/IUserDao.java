package com.ly.mybatisdemo.dao;

import com.ly.mybatisdemo.model.User;
import com.ly.mybatisdemo.model.UserDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lyc28724 on 2016/9/10.
 */
@Repository
public interface IUserDao {

    List<User> findAllUser();

    Integer addUser(User user);

    List<User> queryUser(User user);

    List<User> searchUser(User user);

    Integer deleteUser(Integer userId);

    User loadEditUser(Integer userId);

    Integer postEditUser(User user);

    List<User> queryUserByCities(String[] travelCities);

    UserDetail getUserDetail(Integer userId);
}
