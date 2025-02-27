package trkck.mssc.brewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import trkck.mssc.brewery.web.model.Customer;

import java.util.UUID;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public Customer getCustomerById(UUID uuid) {
        return Customer.builder()
                .id(UUID.randomUUID())
                .customerName("jack").build();
    }

    @Override
    public Customer saveNewCustomer(Customer customer) {
        return Customer.builder().customerName("Jack").id(UUID.randomUUID()).build();
    }

    @Override
    public void update(UUID customerId, Customer cutomer) {
        // to do impl would a real impl to update customer
    }

    @Override
    public void deleteById() {
        log.debug("deleting a beer...");
    }
}
