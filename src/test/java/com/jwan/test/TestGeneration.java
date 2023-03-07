package com.jwan.test;

import com.jwan.domain.User;
import com.jwan.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestGeneration {
    @Autowired
    public UserService userService;
    @Test
    public void testService(){
        List<User> list = userService.list();
        System.out.println(list);
    }
}
