package com.example.demo;

import com.example.demo.entity.Course;
import com.example.demo.repo.CourseRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);


	}

	@Bean
	CommandLineRunner runner(CourseRepo courseRepo){
		return args -> {
			Course course = new Course(2, "Java EE", "Oracle", "Java Programming", "5.0", "Excellent", "Detailed course on Java EE");

			courseRepo.insert(course);

		};
	}


}
