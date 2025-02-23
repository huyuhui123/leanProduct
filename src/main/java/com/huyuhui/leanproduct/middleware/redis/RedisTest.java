package com.huyuhui.leanproduct.middleware.redis;

import com.huyuhui.leanproduct.middleware.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cody
 * @create: 2025/01/22
 **/

@RestController
@RequestMapping("/redis")
public class RedisTest {
    @Autowired
    private RedisService redisService;
    /**
     * setnx的使用和局限性
     */
    @GetMapping("/setnxTest")
    public String setnxTest(){
        //正常使用 会继续往下走
        if (!redisService.setCacheObjectNX("123",5000)){
            return "no";
        }
        
        //不支持可重入锁 第二次就获取不了锁了，会直接抛出 并且如果没有在 finally 删除锁，会导致锁一直存在
        if (!redisService.setCacheObjectNX("123",5000)){
            return "no";
        }
        try {
            
        }finally {
            
        }
        
        return "success";
    }
    
}
