package com.blog.api.model.vo;

import com.blog.api.model.enums.IErrorInfo;
import com.blog.api.utils.TimeUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Builder
@ApiModel("通用接口返回对象")
public class Results<T> {
    @ApiModelProperty(required = true, notes = "结果码", example = "0")
    private int code;
    @ApiModelProperty(required = true, notes = "返回信息", example = "操作成功")
    private String msg;
    @ApiModelProperty(required = true, notes = "返回数据", example = "{\"id\":2001}")
    private T date;
    @ApiModelProperty(required = true, notes = "时间戳", example = "2020-07-23 09:15:46")
    private String timestamp;

    public static <T> Results<T> ok(T date) {
        return Results.<T>builder()
                .msg("操作成功")
                .date(date)
                .timestamp(TimeUtils.now())
                .build();
    }

    public static <T> Results<T> ok(String msg, T date) {
        return Results.<T>builder()
                .msg(msg)
                .date(date)
                .timestamp(TimeUtils.now())
                .build();
    }

    public static Results fromErrorInfo(IErrorInfo errorInfo) {
        return Results.builder()
                .code(errorInfo.getCode())
                .msg(errorInfo.getMsg())
                .timestamp(TimeUtils.now())
                .build();
    }

    public static <T> Results<T> error(T date) {
        return Results.<T>builder()
                .code(500)
                .msg("操作失败")
                .date(date)
                .timestamp(TimeUtils.now())
                .build();
    }

    public static <T> Results<T> error(String msg, T date) {
        return Results.<T>builder()
                .code(500)
                .msg(msg)
                .date(date)
                .timestamp(TimeUtils.now())
                .build();
    }
}
