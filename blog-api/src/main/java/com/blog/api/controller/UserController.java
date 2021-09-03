package com.blog.api.controller;

import com.blog.api.model.entity.User;
import com.blog.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUser() {
        return userService.getAllUser();
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
