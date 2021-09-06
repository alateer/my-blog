package com.blog.api.utils;

import cn.hutool.core.util.IdUtil;

public class UUIDUtils {
    public static String getUUID() {
        return IdUtil.simpleUUID();
    }
}
