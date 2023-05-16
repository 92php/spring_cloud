package com.imooc.course.client;

import com.imooc.course.entity.Course;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


/**
 * 断路器实现类
 */
@Component
public class CourseListClientHystrix implements CourseListClient{
    @GetMapping("courses")
    public List<Course> courseList(){
        List<Course>  defaultCourses = new ArrayList<>();
        Course course = new Course();
        course.setId(1);
        course.setCourseId(1);
        course.setValid(1);
        course.setCourseName("默认课程");
        defaultCourses.add(course);
        return defaultCourses;
    }
}
