package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(1986, Month.AUGUST,7));
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1985, Month.AUGUST,7));
            repository.saveAll(List.of(mariam, alex));
        };

    }
}
