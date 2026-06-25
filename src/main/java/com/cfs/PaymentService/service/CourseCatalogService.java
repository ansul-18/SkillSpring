package com.cfs.PaymentService.service;

import com.cfs.PaymentService.model.Course;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CourseCatalogService {

    private final List<Course> courses= List.of(

            new Course("java-spring","Java & Spring Boot",
                    "Learn Java, Spring Boot, REST APIs, JPA, and build backend applications.",4999),
            new Course("kafka-basics","Apache Kafka Basics",
                    "Understand producers, consumers, topics, partitions, and event-driven architecture.",999),
            new Course("fullstack-web","Full Stack Web Development",
                    "Build modern web applications using HTML, CSS, JavaScript, React, and backend APIs.",6999),
            new Course("python", "Python Programming", "Master Python for automation, web development, and more.", 999)

    );

    public List<Course> findAll()
    {
        return courses;
    }

    public Course findById(String id)
    {
        return courses.stream()
                .filter(c->c.id().equals(id))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Invalid course id: "+ id));
    }
}