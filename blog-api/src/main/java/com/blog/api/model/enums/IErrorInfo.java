package com.blog.api.model.enums;

public interface IErrorInfo {
    /**
     * 获取错误信息
     * @return 错误信息 msg
     */
    String getMsg();

    /**
     * 获取错误码
     * @return 错误码 code
     */
    int getCode();
}
