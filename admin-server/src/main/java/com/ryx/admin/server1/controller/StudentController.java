package com.ryx.admin.server1.controller;

import com.ryx.common.domain.model.Student;
import com.ryx.common.feign.systemService.StudentServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentServiceClient studentServiceClient;

    @GetMapping("/getStudentByName")
    public Student getStudentByName() {
        return studentServiceClient.getStudentInfo();
    }
}
