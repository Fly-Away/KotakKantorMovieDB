package com.movie.db.KotakKantorMovieDB.repository;

import java.util.List;

import com.movie.db.KotakKantorMovieDB.models.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface CustomerRepository extends MongoRepository<Customer, String> {
    
    public Customer findByFirstName(String firstName);
    // public List<Customer> findByLastName(String lastName);
    List<Customer> findByLastName(@Param("name") String name);

}