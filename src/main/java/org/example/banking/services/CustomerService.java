package org.example.banking.services;

import org.example.banking.entity.Customer;

import java.util.List;

public interface CustomerService {
        Customer createCustomer(Customer customer);
        Customer getCustomerId(Long id);
        Customer updateCustomer(Long id,Customer customer);
        String deleteCustomer(Long id);
        List<Customer> getAllCustomer();
}
