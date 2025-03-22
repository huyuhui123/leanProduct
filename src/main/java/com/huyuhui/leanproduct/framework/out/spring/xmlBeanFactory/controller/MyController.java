package com.huyuhui.leanproduct.framework.out.spring.xmlBeanFactory.controller;

import com.huyuhui.leanproduct.framework.out.spring.xmlBeanFactory.service.MyService;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author: cody
 * @create: 2025/02/22
 **/

public class MyController {
    public List<String> selectUserList(){
        MyService myService = new MyService();
        return myService.selectUserList();
    }
    
    
    @Test
    public void get(){
        selectUserList().forEach(System.out::println);
    }
}
