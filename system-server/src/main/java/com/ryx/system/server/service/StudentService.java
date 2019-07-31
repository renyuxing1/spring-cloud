package com.ryx.system.server.service;

import com.ryx.common.domain.model.Student;
import com.ryx.common.feign.systemService.StudentServiceClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentService implements StudentServiceClient {

    @Value("${test1.a}")
    private Integer age;

    @Override
    public Student getStudentInfo() {
        Student student = new Student();
        student.setName("aaa");
        student.setAge(age);
        return student;
    }
}
