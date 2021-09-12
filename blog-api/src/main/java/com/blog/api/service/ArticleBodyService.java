package com.blog.api.service;

import com.blog.api.dao.ArticleBodyMapper;
import com.blog.api.model.entity.ArticleBody;
import com.blog.api.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleBodyService {

    @Autowired(required = false)
    private ArticleBodyMapper articleBodyMapper;

    /**
     * 根据id查询文章
     * @param id
     * @return
     */
    public ArticleBody selectArticleBodyById(String id) {
        return articleBodyMapper.selectById(id);
    }

    /**
     * 新增一篇文章
     * @param articleBody
     * @return
     */
    public int insertArticleBody(ArticleBody articleBody) {
        String id = UUIDUtils.getUUID();
        articleBody.setId(id);
        return articleBodyMapper.insert(articleBody);
    }

    /**
     * 根据id删除一篇文章
     * @param id
     * @return
     */
    public int deleteArticleBody(String id) {
        return articleBodyMapper.deleteById(id);
    }

    /**
     * 更新一篇文章
     * @param articleBody
     * @return
     */
    public int updateArticleBody(ArticleBody articleBody) {
        return articleBodyMapper.updateById(articleBody);
    }
}
