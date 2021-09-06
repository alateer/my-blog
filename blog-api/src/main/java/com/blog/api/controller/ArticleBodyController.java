package com.blog.api.controller;

import com.blog.api.service.ArticleBodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleBodyController {

    @Autowired
    private ArticleBodyService articleBodyService;
}
