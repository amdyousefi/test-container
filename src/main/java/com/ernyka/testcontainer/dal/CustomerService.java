package com.ernyka.testcontainer.dal;

import com.ernyka.testcontainer.entity.Customer;

public interface CustomerService {

  Customer getById(Long id);

  Customer save(Customer campaign);
}
