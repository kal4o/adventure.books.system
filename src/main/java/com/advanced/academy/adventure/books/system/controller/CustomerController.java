package com.advanced.academy.adventure.books.system.controller;


import com.advanced.academy.adventure.books.system.model.Customer;
import com.advanced.academy.adventure.books.system.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping
    public void createOrUpdateCustomer(@RequestBody Customer customer) {
        customerService.createOrUpdateCustomer(customer);
    }


    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") Integer customerId) {
        return customerService.getCustomer(customerId);
    }

    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer customerId) {
        customerService.deleteCustomer(customerId);
    }


}
