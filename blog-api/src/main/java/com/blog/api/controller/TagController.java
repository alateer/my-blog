package com.blog.api.controller;

import com.blog.api.model.entity.Tag;
import com.blog.api.model.vo.Results;
import com.blog.api.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tag")
@Slf4j
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping("/all")
    public List<Tag> getAllTag() {
        List<Tag> tagList = tagService.selectAllTag();
        log.info("全部标签：{}", tagList);
        return tagList;
    }

    @PostMapping("/add")
    public Results addTag(@RequestBody Tag tag) {
        log.info("新增标签：{}", tag);
        int isAdd = tagService.insertTag(tag);
        if(isAdd == 1) {
            return Results.ok("新增成功！", isAdd);
        } else {
            return Results.error("新增失败！", isAdd);
        }
    }

    @PostMapping("/remove/{tagId}")
    public Results removeTag(@PathVariable("tagId")Long tagId) {
        log.info("删除标签id：{}", tagId);
        int isRemove = tagService.deleteTag(tagId);
        if(isRemove == 1) {
            return Results.ok("删除成功！", isRemove);
        } else {
            return Results.error("删除失败！", isRemove);
        }
    }

    @PostMapping("/change")
    public Results changeTag(Tag tag) {
        log.info("更新标签信息：{}", tag);
        int isChange = tagService.updateTag(tag);
        if(isChange == 1) {
            return Results.ok("更新成功！", isChange);
        } else {
            return Results.error("更新失败！", isChange);
        }
    }
}
