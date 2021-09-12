package com.blog.api.service;

import com.blog.api.dao.TagMapper;
import com.blog.api.model.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    @Autowired(required = false)
    private TagMapper tagMapper;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Tag selectTagById(Long id) {
        return tagMapper.selectById(id);
    }

    /**
     * 查询全部tag
     * @return
     */
    public List<Tag> selectAllTag() {
        return tagMapper.selectList(null);
    }

    /**
     * 增加一个tag
     * @param tag
     * @return
     */
    public int insertTag(Tag tag) {
        return tagMapper.insert(tag);
    }

    /**
     * 删除一个tag
     * @param id
     * @return
     */
    public int deleteTag(Long id) {
        return tagMapper.deleteById(id);
    }

    /**
     * 根据id更新tag
     * @param tag
     * @return
     */
    public int updateTag(Tag tag) {
        return tagMapper.updateById(tag);
    }
}
