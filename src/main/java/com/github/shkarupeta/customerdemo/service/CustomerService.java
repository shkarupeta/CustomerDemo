package com.github.shkarupeta.customerdemo.service;

import com.github.shkarupeta.customerdemo.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();

}
