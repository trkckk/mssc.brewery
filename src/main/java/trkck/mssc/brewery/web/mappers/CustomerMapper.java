package trkck.mssc.brewery.web.mappers;

import org.mapstruct.Mapper;
import trkck.mssc.brewery.domain.Customer;
import trkck.mssc.brewery.web.model.CustomerDto;


//@@Mapper
public interface CustomerMapper {
  Customer customerDtoToCustomer(CustomerDto customerDto) ;
  CustomerDto customerToCustomerDto(Customer customer);

}
