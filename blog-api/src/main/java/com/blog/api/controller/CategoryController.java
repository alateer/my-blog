package com.blog.api.controller;

import com.blog.api.model.entity.Category;
import com.blog.api.model.vo.Results;
import com.blog.api.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@Slf4j
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAllCategory() {
        List<Category> categoryList = categoryService.getAllCategory();
        log.info("全部分类信息：{}", categoryList);
        return categoryList;
    }

    @PostMapping("/add")
    public Results addCategory(@RequestBody Category category) {
        int isAdd = categoryService.addCategory(category);
        log.info("新增分类信息：{}", category);
        if(isAdd == 1) {
            return Results.ok("新增分类信息成功！", isAdd);
        } else {
            return Results.error("新增分类信息失败！", isAdd);
        }
    }

    @PostMapping("/change")
    public Results changeCategory(@RequestBody Category category) {
        int isChange = categoryService.updateCategory(category);
        log.info("修改分类信息：{}", category);
        if(isChange ==  1) {
            return Results.ok("修改分类信息成功！", isChange);
        } else {
            return Results.error("修改分类信息失败！", isChange);
        }
    }

    @PostMapping("/remove/{categoryId}")
    public Results removeCategory(@PathVariable("categoryId") String categoryId) {
        int isRemove = categoryService.removeCategory(categoryId);
        log.info("删除分类id：{}", categoryId);
        if(isRemove == 1) {
            return Results.ok("删除分类成功！", isRemove);
        } else {
            return Results.error("删除非连失败！", isRemove);
        }
    }
}
