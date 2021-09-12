package com.blog.api.controller;

import com.blog.api.model.entity.Article;
import com.blog.api.model.vo.Results;
import com.blog.api.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
@Slf4j
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/all")
    public List<Article> getAllArticle() {
        List<Article> articleList = articleService.selectAllArticle();
        log.info("所有文章信息：{}", articleList);
        return articleList;
    }

    @GetMapping("/get/{articleId}")
    public Article getArticleById(@PathVariable("articleId") String articleId) {
        Article article = articleService.selectArticleById(articleId);
        log.info("获取id为{}的文章信息：{}", articleId, article);
        return article;
    }

    @PostMapping("remove/{articleId}")
    public Results removeArticle(@PathVariable("articleId") String articleId) {
        log.info("删除id为{}的文章信息", articleId);
        int isRemove = articleService.deleteArticle(articleId);
        if(isRemove == 1) {
            return Results.ok("删除成功！", isRemove);
        } else {
            return Results.error("删除失败！", isRemove);
        }
    }

    @PostMapping("/add")
    public Results addArticle(@RequestBody Article article) {
        log.info("新增文章信息：{}", article);
        int isAdd = articleService.insertArticle(article);
        if(isAdd == 1) {
            return Results.ok("新增成功！", isAdd);
        } else {
            return Results.error("新增失败！", isAdd);
        }
    }

    @PostMapping("/change")
    public Results changeArticle(@RequestBody Article article) {
        log.info("修改文章信息：{}", article);
        int isChange = articleService.updateArticle(article);
        if(isChange == 1) {
            return Results.ok("修改成功！", isChange);
        } else {
            return Results.error("修改失败！", isChange);
        }
    }
}
