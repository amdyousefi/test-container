// package com.ernyka.testcontainer.config;
//
// import javax.sql.DataSource;
// import lombok.SneakyThrows;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
//
// @Configuration
// public class DatabaseConfig {
//
// @Autowired private DataSource dataSource;
//
// @SneakyThrows
// @Bean
// public String dbUrl() {
// return dataSource.getConnection().getMetaData().getURL();
// }
// }
