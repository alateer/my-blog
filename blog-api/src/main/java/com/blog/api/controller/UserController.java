package com.blog.api.controller;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.blog.api.model.entity.User;
import com.blog.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUser() {
        List<User> userList = userService.getAllUser();
        log.info("全部用户名信息为：{}", userList);
        return userList;
    }

    @PostMapping("/add")
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @CrossOrigin
    @GetMapping("/login/{name}/{pwd}")
    public int getLogin(@PathVariable("name") String name, @PathVariable("pwd") String pwd) {
         return userService.isLogin(name, pwd);
    }

}
