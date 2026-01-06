package com.yupi.backenedusercenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yupi.backenedusercenter.mapper")
public class BackenedUserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackenedUserCenterApplication.class, args);
    }

}
