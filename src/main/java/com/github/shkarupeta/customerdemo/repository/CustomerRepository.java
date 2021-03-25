package com.github.shkarupeta.customerdemo.repository;

import com.github.shkarupeta.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
