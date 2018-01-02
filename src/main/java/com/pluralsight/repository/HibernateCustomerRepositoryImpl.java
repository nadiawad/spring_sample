package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nadi on 20/12/2017.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Nadi");
        customer.setLastName("Awad");

        customers.add(customer);

        return customers;
    }
}
