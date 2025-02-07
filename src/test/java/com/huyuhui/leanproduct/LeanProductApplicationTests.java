package com.huyuhui.leanproduct;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
class LeanProductApplicationTests {

    /**
     * a+b和a+=b的区别
     */
    @Test
    void contextLoads() {
        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(2);
        a+=b;
        System.out.println(a+"-"+b);
    }
    
    @Test
    public void test2(){
        System.out.println(3*0.1==0.3);
    }

}
