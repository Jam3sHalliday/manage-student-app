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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jam3s = new Student(
                    1L,
                    "jam3shalliday",
                    "jam3sha@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 05)
            );

            Student hiro = new Student(
                    241L,
                    "hiro saki",
                    "hirosaki@gmail.com",
                    LocalDate.of(2020, Month.MARCH, 12)
            );
            repository.saveAll(List.of(jam3s, hiro));
        };
    }

}
