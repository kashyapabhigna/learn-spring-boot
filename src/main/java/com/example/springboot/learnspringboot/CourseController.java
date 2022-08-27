package com.example.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    //https://localhost:8080/courses - url. When this url is hit, the below data must be returned
    //Return details - Courses : id, name, author

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Core Java","Cay S. Horstmann"),
                new Course(2,"SpringBoot3"," Greg L. Turnquist"),
                new Course(3,"Mastering Junit","Sujoy Acharya")
        );
    }
}
