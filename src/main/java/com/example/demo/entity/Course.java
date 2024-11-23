package com.example.demo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@NoArgsConstructor
@Data
@Document(collection = "")
public class Course {

    @Id
    private Integer id;
    private String courseTitle;
    private String courseOrganization;
    private String courseCompetences;
    private String courseRating;
    private String courseReviews;
    private String courseDetails;

    public Course(Integer id, String courseTitle, String courseOrganization, String courseCompetences, String courseRating, String courseReviews, String courseDetails) {
        this.id = id;
        this.courseTitle = courseTitle;
        this.courseOrganization = courseOrganization;
        this.courseCompetences = courseCompetences;
        this.courseRating = courseRating;
        this.courseReviews = courseReviews;
        this.courseDetails = courseDetails;
    }
}
