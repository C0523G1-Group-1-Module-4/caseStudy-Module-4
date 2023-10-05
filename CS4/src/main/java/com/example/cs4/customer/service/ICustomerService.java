package com.example.cs4.customer.service;

import com.example.cs4.customer.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {


    void delete(int id);
    Customer findById(int id);

    void save(Customer customer);

    Page<Customer> showList(Pageable pageable, String searchName);
}
