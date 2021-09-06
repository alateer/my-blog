package com.blog.api.service;

import com.blog.api.dao.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired(required = false)
    private CategoryMapper categoryMapper;


}
