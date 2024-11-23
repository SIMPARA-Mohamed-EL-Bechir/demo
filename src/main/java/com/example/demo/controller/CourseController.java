package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseRepo courseRepo;


    @GetMapping("/findAll")
    public List<Course> getCourse() {
        return courseRepo.findAll();
    }

    @PostMapping("/insert")
    public Course addCourse(@RequestBody Course course) {
        return courseRepo.save(course);
    }

}
