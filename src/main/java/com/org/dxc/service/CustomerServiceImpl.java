package com.org.dxc.service;

import com.org.dxc.model.Customer;
import com.org.dxc.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    @Override
    public void createCustomer(Customer customer) {
         customerRepo.save(customer);

    }

    @Override
    public List<Customer> getAll() {
        List<Customer> bb=customerRepo.findAll();
        return bb;
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepo.save(customer);

    }

    @Override
    public String deleteById(Integer id) {
        customerRepo.deleteById(id);
        return "naveen";
    }
}
