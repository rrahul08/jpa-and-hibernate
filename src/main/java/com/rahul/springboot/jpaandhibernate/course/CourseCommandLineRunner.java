package com.rahul.springboot.jpaandhibernate.course;

import com.rahul.springboot.jpaandhibernate.course.Course;
import com.rahul.springboot.jpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.rahul.springboot.jpaandhibernate.course.jpa.CourseJpaRepository;
import com.rahul.springboot.jpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Course(1,"FullStack","Youtube"));
        repository.save(new Course(2,"MachineLearning","Youtube"));
        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("Youtube"));
    }
}
