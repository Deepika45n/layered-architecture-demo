package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "mariam",
                    "mariam@gmail.com",
                    13,
                    LocalDate.of(2005, MAY, 4)
            );

            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    18,
                    LocalDate.of(2000, JANUARY, 2)

            );
            repository.saveAll(List.of(mariam,alex));

            };
        };
    };


