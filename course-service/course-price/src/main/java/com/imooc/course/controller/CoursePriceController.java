package com.imooc.course.controller;


import com.imooc.course.client.CourseListClient;
import com.imooc.course.entity.Course;
import com.imooc.course.entity.CourseAndPrice;
import com.imooc.course.entity.CoursePrice;
import com.imooc.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursePriceController {

    @Autowired
    CoursePriceService coursePriceService;

    @Autowired
    CourseListClient courseListClient;

    @GetMapping("/price")
    public Integer getCoursePrice(Integer courseId){
        CoursePrice coursePrice = coursePriceService.getCoursePrice(courseId);
        return coursePrice.getPrice();
    }


    @GetMapping("/coursesInPrice")
    public List<Course> getCourseListInPrice(Integer courseId){
        List<Course> courses = courseListClient.courseList();
        return courses;
    }


    @GetMapping("/coursesAndPrice")
    public List<CourseAndPrice> getCoursesAndPrice(){
        List<CourseAndPrice> coursesAndPrice = coursePriceService.getCoursesAndPrice();
        return coursesAndPrice;
    }

}
