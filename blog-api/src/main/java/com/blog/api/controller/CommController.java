package com.blog.api.controller;

import com.blog.api.model.vo.Results;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("通用接口")
@RestController
public class CommController {

    @ApiOperation("检查服务端是否异常")
    @GetMapping("/ping")
    public Results ping() {
        return Results.ok("欢迎访问my-blog Api！", null);
    }
}
