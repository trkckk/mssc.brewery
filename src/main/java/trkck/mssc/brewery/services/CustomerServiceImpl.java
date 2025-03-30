package trkck.mssc.brewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import trkck.mssc.brewery.web.model.CustomerDto;

import java.util.UUID;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID uuid) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("jack").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().customerName("Jack").id(UUID.randomUUID()).build();
    }

    @Override
    public void update(UUID customerId, CustomerDto cutomer) {
        // to do impl would a real impl to update customer
    }

    @Override
    public void deleteById() {
        log.debug("deleting a beer...");
    }
}
