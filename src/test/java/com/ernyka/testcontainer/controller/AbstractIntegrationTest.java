package com.ernyka.testcontainer.controller;

import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.parallel.Execution;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
// @ActiveProfiles("localtest")
// @TestPropertySource(locations = "/application-localtest.yml")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
// @WithMockUser(authorities = {"SYSTEM", "INSTITUTE", "CLINIC", "CLIENT",
// "CAREGIVER"})
@Execution(CONCURRENT)
@Slf4j
public class AbstractIntegrationTest {

  // protected static final Principal INSTITUTE_PRINCIPAL = () ->
  // "instituteopttid";
}
