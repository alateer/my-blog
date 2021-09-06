package com.blog.api.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 分类表
 */
@Data
public class Category {

    /**
     * 主键id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 分类名
     */
    @TableField(value = "category_name")
    private String categoryName;

    /**
     * 分类描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 背景图位置
     */
    @TableField(value = "avatar")
    private String avatar;
}
