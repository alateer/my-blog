package com.blog.api.controller;

import com.blog.api.model.vo.PageVO;
import com.blog.api.model.vo.Results;
import com.blog.api.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api("与文章相关的api")
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @ApiOperation("批量获取文章")
    @GetMapping("/articles")
    public Results<PageVO> getArticles(
            @ApiParam("页码")
            @RequestParam(required = false, defaultValue = "1") Integer page,
            @ApiParam("每页存放的记录数")
            @RequestParam(required = false, defaultValue = "5") Integer limit) {
        return Results.ok(articleService.getArticles(page, limit));
    }
}
