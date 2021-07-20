package com.blog.api.model.vo;

public interface IConverter<T, E> {

    /**
     * VO 转化函数
     *
     * @param t 目标对象
     * @return 转化结果
     */
    E convertToVO(T t);
}
