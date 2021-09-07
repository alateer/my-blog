package com.blog.api.service;

import com.blog.api.dao.CategoryMapper;
import com.blog.api.model.entity.Category;
import com.blog.api.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired(required = false)
    private CategoryMapper categoryMapper;

    /**
     * 查
     * @return
     */
    public List<Category> getAllCategory() {
        return categoryMapper.selectList(null);
    }

    /**
     * 改
     * @param category
     * @return
     */
    public int updateCategory(Category category) {
        return categoryMapper.updateById(category);
    }

    /**
     * 删
     * @param id
     * @return
     */
    public int removeCategory(String id) {
        return categoryMapper.deleteById(id);
    }

    /**
     * 增
     * @param category
     * @return
     */
    public int addCategory(Category category) {
        String categoryId = UUIDUtils.getUUID();
        category.setId(categoryId);
        return categoryMapper.insert(category);
    }

}
