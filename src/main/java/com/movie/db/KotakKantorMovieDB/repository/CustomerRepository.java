package com.movie.db.KotakKantorMovieDB.repository;

import java.util.List;

import com.movie.db.KotakKantorMovieDB.models.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    
    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}