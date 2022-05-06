package com.org.dxc.service;

import com.org.dxc.model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerService {
    public void createCustomer( Customer customer);
    public List<Customer> getAll();
    public void updateCustomer( Customer customer);
    public String deleteById(Integer id);
}
