package com.rahul.springboot.jpaandhibernate.course.springdatajpa;

import com.rahul.springboot.jpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    List <Course> findByAuthor (String author);
}
