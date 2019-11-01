package com.advanced.academy.adventure.books.system.service;

import com.advanced.academy.adventure.books.system.model.Customer;
import com.advanced.academy.adventure.books.system.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }

    public void createOrUpdateCustomer(Customer customer) {
       if(null== customer.getId()) {
           //to do create
        return ;
       }
        //to do update
        //return customer.getUserName();
    }

    public Customer getCustomer(Integer customerId) {
        return null;
    }


    private void createOrUpdateCustomer(Customer customer) {
        if(null==customer.getId()) {
            validateAndCreateCustomer(customer);
            return;
        }
    }
    private void validateAndUpdateCustomer(Customer customer) {
        validateCustomer();
        //customerRepository.save(customer);  //towa pi6e v bazata!
    }
    private void validateAndCreateCustomer(Customer customer) {
        validateCustomer();
        //customerRepository.save(customer);  //towa pi6e v bazata
    }
    private void validateCustomer() {

    }

    public void deleteCustomer(Integer customerId) {

    }
}


