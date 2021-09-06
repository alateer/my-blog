package com.blog.api.service;

import com.blog.api.dao.ArticleBodyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleBodyService {

    @Autowired(required = false)
    private ArticleBodyMapper articleBodyMapper;
}
