package com.blog.api.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 标签表
 */
@Data
public class Tag {

    /**
     * 主键id
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 标签名
     */
    @TableField(value = "tag_name")
    private String tagName;

    /**
     * 背景图片位置
     */
    @TableField(value = "avatar")
    private String avatar;
}
