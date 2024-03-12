package com.ernyka.testcontainer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.ernyka.testcontainer.entity.Customer;
import com.ernyka.testcontainer.service.CustomerService;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerServiceWithJUnit5ExtensionTest extends AbstractDatabaseContainer {

  CustomerService customerService;

  @BeforeEach
  void setUp() {
    customerService =
        new CustomerService(postgres.getJdbcUrl(), postgres.getUsername(), postgres.getPassword());
    customerService.deleteAllCustomers();
  }

  @Test
  void shouldCreateCustomer() {
    customerService.createCustomer(new Customer(1L, "George"));

    Optional<Customer> customer = customerService.getCustomer(1L);
    assertTrue(customer.isPresent());
    assertEquals(1L, customer.get().getId());
    assertEquals("George", customer.get().getName());
  }

  @Test
  void shouldGetCustomers() {
    customerService.createCustomer(new Customer(1L, "George"));
    customerService.createCustomer(new Customer(2L, "John"));

    List<Customer> customers = customerService.getAllCustomers();
    assertEquals(2, customers.size());
  }
}
