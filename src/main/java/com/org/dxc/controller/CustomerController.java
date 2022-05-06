package com.org.dxc.controller;

import com.org.dxc.model.Customer;
import com.org.dxc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
@Autowired
    CustomerService customerService;

    @PostMapping("/create")
    public void createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
    }
    @GetMapping("/getAll")
    public List<Customer>getAll(){
        List<Customer> vv =customerService.getAll();
        return vv;
    }
    @PutMapping("/update")
    public void updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }
@DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
       String success = customerService.deleteById(id);
        return "success";

}
}
