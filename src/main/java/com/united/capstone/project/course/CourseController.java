package com.united.capstone.project.course;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping("/save")
    @ApiOperation(value = "it is saving new course")
    public String saveCourse(@RequestBody Course course) {

        return service.saveCourse(course);

    }


    @GetMapping("/getCourse")
    @ApiOperation(value = "it will fetch all courses")
    public List<Course> getAllCourses() {
        return service.getAllCourse();
    }

    @DeleteMapping("/deleteCourse/{courseId}")
    @ApiOperation(value = "it will delete course with id")
    public List<Course> deleteCourseById(@PathVariable int courseId) {
        return service.deleteCourseById(courseId);
    }


}
