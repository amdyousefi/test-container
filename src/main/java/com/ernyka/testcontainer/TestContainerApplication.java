package com.ernyka.testcontainer;

import java.util.TimeZone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TestContainerApplication {

  public static void main(String[] args) {
    SpringApplication.run(TestContainerApplication.class, args);
    TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
  }
}
