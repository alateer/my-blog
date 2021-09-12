package com.blog.api.controller;

import com.blog.api.model.entity.ArticleBody;
import com.blog.api.model.vo.Results;
import com.blog.api.service.ArticleBodyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/articleBody")
@Slf4j
public class ArticleBodyController {

    @Autowired
    private ArticleBodyService articleBodyService;

    @GetMapping("/get/{articleBodyId}")
    public ArticleBody getArticleBodyById(@PathVariable("articleBodyId") String articleBodyId) {
        ArticleBody articleBody = articleBodyService.selectArticleBodyById(articleBodyId);
        log.info("获取id为{}的文章：{}",articleBodyId, articleBody);
        return articleBody;
    }

    @PostMapping("/add")
    public Results addArticleBody(@RequestBody ArticleBody articleBody) {
        log.info("新增一篇文章：{}", articleBody);
        int isAdd = articleBodyService.insertArticleBody(articleBody);
        if(isAdd == 1) {
            return Results.ok("新增成功！", isAdd);
        } else {
            return Results.error("新增失败！", isAdd);
        }
    }

    @PostMapping("/remove/{articleBodyId}")
    public Results removeArticleBody(@PathVariable("articleBodyId") String articleBodyId) {
        log.info("删除id为{}的文章", articleBodyId);
        int isRemove = articleBodyService.deleteArticleBody(articleBodyId);
        if(isRemove == 1) {
            return Results.ok("删除成功！", isRemove);
        } else {
            return Results.error("删除失败！", isRemove);
        }
    }

    @PostMapping("/change")
    public Results changeArticleBody(@RequestBody ArticleBody articleBody) {
        log.info("修改一篇文章：{}", articleBody);
        int isChange = articleBodyService.insertArticleBody(articleBody);
        if(isChange == 1) {
            return Results.ok("修改成功！", isChange);
        } else {
            return Results.error("修改失败！", isChange);
        }
    }
}
