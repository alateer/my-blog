package com.blog.api;

import com.blog.api.dao.UserMapper;
import com.blog.api.model.entity.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SampleTest {
    @Autowired
    private UserMapper userMapper;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testSelect() {
        System.out.println("Select all data");
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        logger.info("Info!");
        logger.error("Error!");
        logger.debug("Debug!");
        logger.trace("Trace");
        logger.warn("Warn");
        logger.info("UserInfo is {}", userList);
    }
}
