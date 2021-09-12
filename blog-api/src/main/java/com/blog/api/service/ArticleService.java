package com.blog.api.service;

import com.blog.api.dao.ArticleMapper;
import com.blog.api.model.entity.Article;
import com.blog.api.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired(required = false)
    private ArticleMapper articleMapper;

    /**
     * 获取全部文章信息
     * @return
     */
    public List<Article> selectAllArticle() {
        return articleMapper.selectList(null);
    }

    /**
     * 根据id获取文章信息
     * @param id
     * @return
     */
    public Article selectArticleById(String id) {
        return articleMapper.selectById(id);
    }

    /**
     * 新增文章信息
     * @param article
     * @return
     */
    public int insertArticle(Article article) {
        String id = UUIDUtils.getUUID();
        article.setId(id);
        return articleMapper.insert(article);
    }

    /**
     * 根据id删除文章信息
     * @param id
     * @return
     */
    public int deleteArticle(String id) {
        return articleMapper.deleteById(id);
    }

    /**
     * 更新文章信息
     * @param article
     * @return
     */
    public int updateArticle(Article article) {
        return articleMapper.updateById(article);
    }
}
