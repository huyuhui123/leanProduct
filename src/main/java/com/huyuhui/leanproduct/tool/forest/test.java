package com.huyuhui.leanproduct.tool.forest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

/**
 * @author: cody
 * @create: 2025/01/21
 **/
@SpringBootTest
public class test {
    @Autowired
    private AmapClient amapClient;
    
    @Test
    public void test1(){
    // 调用接口
    Map result = amapClient.getLocation("121.475078", "31.223577");
    //System.out.println(result);
    }
}
