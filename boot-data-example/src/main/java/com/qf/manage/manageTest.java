package com.qf.manage;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.qf.manage.mapper")
@SpringBootApplication
public class manageTest {
    public static void main(String[] args) {
        SpringApplication.run(manageTest.class,args);
    }
}
