package com.ernyka.testcontainer.dal;

import com.ernyka.testcontainer.entity.Customer;
import com.ernyka.testcontainer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
  private final CustomerRepository customerRepository;

  public CustomerServiceImpl(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Override
  public Customer getById(Long id) {
    return customerRepository
        .findById(id)
        .orElseThrow(() -> new RuntimeException("Customer not found. id: " + id));
  }

  @Override
  @Transactional
  public Customer save(Customer customer) {
    return customerRepository.save(customer);
  }
}
