package com.blog.api.service;

import com.blog.api.dao.UserMapper;
import com.blog.api.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    //查询：根据主键查询、根据姓名查询

    /**
     * 获取所有的用户信息
     * @return List<User>
     */
    public List<User> getAllUser() {
        return userMapper.selectList(null);
    }

    /**
     * 登录验证
     * @param name
     * @param password
     * @return
     */
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

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    public User getUserById(String id) {
        return userMapper.selectById(id);
    }


    //增加：增加一个、增加多个

    /**
     * 新增一个用户
     * @param user
     * @return
     */
    public int addUser(User user) {
        return userMapper.insert(user);
    }


    //删除：删除一个、删除多个

    /**
     * 根据id删除一个用户
     * @param id
     * @return
     */
    public int removeUser(String id) {
        return userMapper.deleteById(id);
    }


    //修改（更新）

    /**
     * 根据id更新用户信息
     * @param user
     * @return
     */
    public int updateUser(User user) {
        return userMapper.updateById(user);
    }
}
