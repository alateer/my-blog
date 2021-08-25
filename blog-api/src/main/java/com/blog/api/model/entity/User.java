package com.blog.api.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user")
public class User {
    @TableId(value = "id")
    private String id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "password")
    private String password;
    @TableField(value = "age")
    private Integer age;
}
