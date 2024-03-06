package com.telusko.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
