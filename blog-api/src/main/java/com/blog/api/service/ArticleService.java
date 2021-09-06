package com.blog.api.service;

import com.blog.api.dao.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired(required = false)
    private ArticleMapper articleMapper;


}
