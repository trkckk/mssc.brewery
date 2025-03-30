package trkck.mssc.brewery.services;

import trkck.mssc.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID uuid);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void update(UUID customerId, CustomerDto cutomer);

    void deleteById();
}
