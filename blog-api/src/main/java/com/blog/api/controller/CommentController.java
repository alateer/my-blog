package com.blog.api.controller;

import com.blog.api.model.entity.Comment;
import com.blog.api.model.vo.Results;
import com.blog.api.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
@Slf4j
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/all")
    public List<Comment> getAllComment() {
        List<Comment> commentList = commentService.selectAllComment();
        log.info("所有评论信息：{}", commentList);
        return commentList;
    }

    @GetMapping("/get/{commentId}")
    public Comment getCommentById(@PathVariable("commentId") String commentId) {
        Comment comment = commentService.selectCommentById(commentId);
        log.info("获取id为{}的评论信息：{}", commentId, comment);
        return comment;
    }

    @PostMapping("/add")
    public Results addComment(@RequestBody Comment comment) {
        log.info("新增一个评论信息：{}", comment);
        int isAdd = commentService.insertComment(comment);
        if(isAdd == 1) {
            return Results.ok("新增成功！", isAdd);
        } else {
            return Results.error("新增失败！", isAdd);
        }
    }

    @PostMapping("/remove/{commentId}")
    public Results removeComment(@PathVariable("commentId") String commentId) {
        log.info("删除id为{}的评论", commentId);
        int isRemove = commentService.deleteComment(commentId);
        if(isRemove == 1) {
            return Results.ok("删除成功！", isRemove);
        } else {
            return Results.error("删除失败！", isRemove);
        }
    }

    @PostMapping("/change")
    public Results changeComment(@RequestBody Comment comment) {
        log.info("更新一个评论信息：{}", comment);
        int isChange = commentService.updateComment(comment);
        if(isChange == 1) {
            return Results.ok("更新成功！", isChange);
        } else {
            return Results.error("更新失败！", isChange);
        }
    }
}
