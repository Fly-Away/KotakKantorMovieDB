package com.movie.db.KotakKantorMovieDB.controllers;

import com.movie.db.KotakKantorMovieDB.models.Customer;
import com.movie.db.KotakKantorMovieDB.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

  @Autowired
  private CustomerRepository repository;

  @GetMapping("/customer")
  public Customer findCustomer() {
    return repository.findByFirstName("cactuspot");
  }
  
  @PostMapping("/addcustomer")
  public Customer addCustomer(@RequestBody Customer newCustomer ) {
    return repository.save(newCustomer);
  }

}