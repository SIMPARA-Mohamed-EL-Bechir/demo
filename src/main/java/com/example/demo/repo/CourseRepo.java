package com.example.demo.repo;

import com.example.demo.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepo extends MongoRepository<Course, String> {
}
