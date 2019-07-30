package com.ryx.admin;

import com.ryx.common.domain.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients(basePackages = "com.ryx.common.feign")
@EnableEurekaClient
@SpringBootApplication
public class AdminServerApplication {

    @Value("${server.port}")
    private String port ;
    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);

    }
    @Bean
    public Student getStudent(){
        Student student = new Student();
        System.out.println(port+"+++++++++++++++++=================");
        return student;
    }

}
