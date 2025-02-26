package trkck.mssc.brewery.services;

import org.springframework.stereotype.Service;
import trkck.mssc.brewery.web.model.Customer;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public Customer getCustomerById(UUID uuid) {
        return Customer.builder()
                .id(UUID.randomUUID())
                .customerName("jack").build();
    }
}
