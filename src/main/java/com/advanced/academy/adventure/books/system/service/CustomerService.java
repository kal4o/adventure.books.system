package com.advanced.academy.adventure.books.system.service;

import com.advanced.academy.adventure.books.system.model.Customer;
import com.advanced.academy.adventure.books.system.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }

    public void createOrUpdateCustomer(Customer customer) {
       if(null== customer.getId()) {
           createCustomer(customer);
        return;
       }
       updateCustomer(customer);
        //to do update
        //return customer.getUserName();
    }

    public Customer getCustomer(Integer customerId) {

        Optional<Customer> customer = customerRepository.findById(customerId);
        if (!customer.isPresent()) {
            throw new RuntimeException("Customer not found!");
        }
        return customer.get();
    }


    private void updateCustomer(Customer customer) {

        customerRepository.save(customer);  //towa pi6e v bazata!
    }
    private void createCustomer(Customer customer) {
        customerRepository.save(customer);  //towa pi6e v bazata
    }

    public void deleteCustomer(Integer customerId) {
        // customerRepository.deleteById(customerId);  //nikoga ne triem!!
        customerRepository.deactivateCustomer(customerId);
    }
}


