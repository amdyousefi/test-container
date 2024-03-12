package com.ernyka.testcontainer.repository;

import com.ernyka.testcontainer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

  /*
   * Optional<Customer> findByCode(String code);
   */
}
