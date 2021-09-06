package com.blog.api.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 评论表
 */
@Data
public class Comment {

    /**
     * 评论表主键id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 文章id
     */
    @TableField(value = "article_id")
    private String articleId;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 文章作者id
     */
    @TableField(value = "article_user_id")
    private String articleUserId;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private Timestamp createDate;


}
