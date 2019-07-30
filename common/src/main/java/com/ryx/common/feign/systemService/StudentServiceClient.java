package com.ryx.common.feign.systemService;

import com.ryx.common.constant.ServerName;
import com.ryx.common.domain.model.Student;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value= ServerName.SYSTEM_SERVER,fallbackFactory = StudentServiceClientFallback.class)
public interface StudentServiceClient {

    @RequestMapping(value = "/feign/v1/getStudentInfo")
    public Student getStudentInfo();

}

@Component
class StudentServiceClientFallback implements StudentServiceClient, FallbackFactory{

    private Throwable throwable;
    private StudentServiceClientFallback(Throwable throwable){ this.throwable = throwable;}
    @Override
    public StudentServiceClientFallback create(Throwable throwable) {
        return new StudentServiceClientFallback(throwable);
    }

    @Override
    public Student getStudentInfo() {
        return null;
    }
}
