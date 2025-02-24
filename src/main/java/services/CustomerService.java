package services;

import trkck.mssc.brewery.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID uuid);
}
