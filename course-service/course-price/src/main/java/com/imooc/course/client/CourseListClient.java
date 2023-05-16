package com.imooc.course.client;

import com.imooc.course.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 课程类表Feign客户端
 */
@FeignClient(value= "course-list",fallback = CourseListClientHystrix.class )
@Primary
public interface CourseListClient {

    @GetMapping("courses")
    public List<Course> courseList();
}
