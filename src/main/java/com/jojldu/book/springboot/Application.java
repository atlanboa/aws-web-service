package com.jojldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * SpringBootApplication Annotation
 * AutoConfiguration, Spring Bean Read and Create
 *
 * Always this class is be at top of project
 *
 */
@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        /**
         * SpringApplication.run -> run Embeded WAS
         *
         * 내장 WAS를 사용함으로써도 성능상에서 발생하는 문제는 없다.
         */
        SpringApplication.run(Application.class, args);
    }
}
