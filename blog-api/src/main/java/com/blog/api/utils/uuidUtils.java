package com.blog.api.utils;

import cn.hutool.core.util.IdUtil;

public class uuidUtils {
    public String getUUID() {
        return IdUtil.simpleUUID();
    }
}
