package com.ryx.system.server.service;

import com.ryx.common.domain.model.Student;
import com.ryx.common.feign.systemService.StudentServiceClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentService implements StudentServiceClient {
    @Override
    public Student getStudentInfo() {
        Student student = new Student();
        student.setName("aaa");
        student.setAge(11);
        return student;
    }
}
