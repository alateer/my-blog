package com.blog.api.model.enums;

public enum ErrorInfoEnum implements IErrorInfo {
    SUCCESS(200, "操作成功"),
    MESSAGE_PARAMETERS(404, "参数缺失"),
    UNKNOWN_ERROR(500, "出现未知错误"),
    RESOURCE_NOT_FOND(403, "找不到相应资源");

    private int code;
    private String msg;

    ErrorInfoEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public int getCode() {
        return code;
    }
}
