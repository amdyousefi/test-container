package com.ernyka.testcontainer;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
public abstract class AbstractDatabaseContainer {

    @Container
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(
            DockerImageName.parse("postgres:16-alpine"));


   /* static {
        postgres.start();
    }

    @BeforeAll
    static void beforeAll() {
        //register JDBC properties with your app using
        // postgres.getJdbcUrl(), postgres.getUsername(), postgres.getPassword()
        //register Kafka broker url with your app using kafka.getBootstrapServers()
    }*/
}