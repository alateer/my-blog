package com.blog.api.service;

import com.blog.api.dao.UserMapper;
import com.blog.api.model.entity.User;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    //查
    public List<User> getAllUser() {
        return userMapper.selectList(null);
    }

    public int isLogin(String name, String password) {
        int flag = 0;
        List<User> userList = userMapper.selectList(null);
        for (User user : userList) {
            if(user.getName().equals(name) && user.getPassword().equals(password)) {
                flag = 1;
            }
        }
        return flag;
    }
}
