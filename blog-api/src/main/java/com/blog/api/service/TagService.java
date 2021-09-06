package com.blog.api.service;

import com.blog.api.dao.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {

    @Autowired(required = false)
    private TagMapper tagMapper;


}
