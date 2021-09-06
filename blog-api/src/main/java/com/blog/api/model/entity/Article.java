package com.blog.api.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 文章结构表
 */
@Data
public class Article {

    /**
     * 主键id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 梗概
     */
    @TableField(value = "summary")
    private String summary;

    /**
     * 作者id
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 分类id
     */
    @TableField(value = "category_id")
    private String categoryId;

    /**
     * 文章内容id
     */
    @TableField(value = "body_id")
    private String bodyId;

    /**
     * 标签id
     */
    @TableField(value = "tag_id")
    private String tagId;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private Timestamp createDate;

    /**
     * 更新时间
     */
    @TableField(value = "update_date")
    private Timestamp updateDate;

    /**
     * 评论数
     */
    @TableField(value = "comment_counts")
    private Long commentCounts;

    /**
     * 浏览量
     */
    @TableField(value = "view_counts")
    private Long viewCounts;
}
