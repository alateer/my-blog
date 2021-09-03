package com.blog.api.utils;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeUtils {

    /**
     * 通过Java8中的LocalDateTime通过时间戳获取当前时间
     * @return 格式化后的时间戳字符串
     */
    public static String now() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static String formatDatetime(Long datetime) {
        Date date = new Date(datetime);
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }
}
