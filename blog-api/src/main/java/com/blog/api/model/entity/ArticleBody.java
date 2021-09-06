package com.blog.api.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 文章内容表
 */
@Data
public class ArticleBody {

    /**
     * 主键id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 文章主体内容
     */
    @TableField(value = "content")
    private String content;
}
