package trkck.mssc.brewery.web.controller;


import jakarta.validation.Valid;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import trkck.mssc.brewery.services.CustomerService;
import trkck.mssc.brewery.web.model.CustomerDto;

import java.util.UUID;

@Validated
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> getCustomer(@RequestParam("customerId")UUID customerId){

        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity handlePost(@Valid @RequestBody CustomerDto customerDto){
        CustomerDto saveCustomerDto = customerService.saveNewCustomer(customerDto);

        HttpHeaders headers = new HttpHeaders();

        headers.add("Location", "http//localhost:8080/api/v1/customer/" + saveCustomerDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
    @PutMapping({"/{customerId}"})
    public ResponseEntity handleUpdate(@PathVariable("customerId") UUID customerId,@Valid @RequestBody CustomerDto cutomer) {

        customerService.update(customerId, cutomer);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("customerId") UUID customer){
        customerService.deleteById();
    }



}
