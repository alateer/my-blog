package com.blog.api.service;

import com.blog.api.dao.CommentMapper;
import com.blog.api.model.entity.Comment;
import com.blog.api.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired(required = false)
    private CommentMapper commentMapper;

    public List<Comment> selectAllComment() {
        return commentMapper.selectList(null);
    }

    public Comment selectCommentById(String id) {
        return commentMapper.selectById(id);
    }

    public int insertComment(Comment comment) {
        String id = UUIDUtils.getUUID();
        return commentMapper.insert(comment);
    }

    public int deleteComment(String id) {
        return commentMapper.deleteById(id);
    }

    public int updateComment(Comment comment) {
        return commentMapper.updateById(comment);
    }
}
