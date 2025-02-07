package com.huyuhui.leanproduct;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ForestScan(basePackages = "com.huyuhui.leanproduct.forest")
public class LeanProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeanProductApplication.class, args);
    }

}
