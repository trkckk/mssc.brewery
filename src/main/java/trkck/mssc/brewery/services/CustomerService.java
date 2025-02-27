package trkck.mssc.brewery.services;

import trkck.mssc.brewery.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID uuid);

    Customer saveNewCustomer(Customer customer);

    void update(UUID customerId, Customer cutomer);

    void deleteById();
}
