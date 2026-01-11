package org.example.banking.controller;

import org.example.banking.entity.Customer;
import org.example.banking.services.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customers")
public class CustomerController {
        private final CustomerService services;

    public CustomerController(CustomerService services) {
        this.services = services;
    }

    //create
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return services.createCustomer(customer);
    }

    // Read by id
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id){
            return services.getCustomerId(id);
    }

    // update
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id,
                                   @RequestBody Customer customer){
        return services.updateCustomer(id,customer);
    }
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id){
        return services.deleteCustomer(id);
    }

}
