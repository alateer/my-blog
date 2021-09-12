package com.blog.api.controller;

import com.blog.api.model.entity.User;
import com.blog.api.model.vo.Results;
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
    public Results addUser(@RequestBody User user) {
        int isAdd = userService.addUser(user);
        log.info("新增用户：{}", user);
        if(isAdd == 1) {
            return Results.ok("新增成功！", isAdd);
        } else {
            return Results.error("新增失败！", isAdd);
        }
    }

    @PostMapping("/remove/{userId}")
    public Results removeUser(@PathVariable("userId") String userId) {
        int isRemove = userService.removeUser(userId);
        log.info("删除用户id：{}", userId);
        if(isRemove == 1) {
            return Results.ok("删除成功！", isRemove);
        } else {
            return Results.error("删除失败！", isRemove);
        }
    }

    @PostMapping("/change")
    public Results changeUser(@RequestBody User user) {
        int isChange = userService.updateUser(user);
        log.info("修改用户信息为：{}", user);
        if(isChange == 1) {
            return Results.ok("更新成功！", isChange);
        } else {
            return Results.error("更新失败！", isChange);
        }
    }

    @GetMapping("/login/{name}/{pwd}")
    public int getLogin(@PathVariable("name") String name, @PathVariable("pwd") String pwd) {
         return userService.isLogin(name, pwd);
    }

}
