package com.avanade.cosmos.cloud.application.controller;

import com.avanade.cosmos.cloud.application.model.CustomerModel;
import com.avanade.cosmos.cloud.application.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/save")
    public ResponseEntity<CustomerModel> save(@RequestBody CustomerModel customer) {
        return ResponseEntity.ok(repository.save(customer));
    }

    @GetMapping("/all")
    public ResponseEntity<List<CustomerModel>> all() {
        return ResponseEntity.ok(repository.findAll());
    }

}
