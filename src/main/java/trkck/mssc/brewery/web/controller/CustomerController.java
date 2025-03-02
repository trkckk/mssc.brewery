package trkck.mssc.brewery.web.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trkck.mssc.brewery.services.CustomerService;
import trkck.mssc.brewery.web.model.Customer;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<Customer> getCustomer(@RequestParam("customerId")UUID customerId){

        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity handlePost(@RequestBody Customer customer){
        Customer saveCustomer = customerService.saveNewCustomer(customer);

        HttpHeaders headers = new HttpHeaders();

        headers.add("Location", "http//localhost:8080/api/v1/customer/" + saveCustomer.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
    @PutMapping({"/{customerId}"})
    public ResponseEntity handleUpdate(@PathVariable("customerId") UUID customerId,@RequestBody Customer cutomer) {

        customerService.update(customerId, cutomer);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("customerId") UUID customer){
        customerService.deleteById();
    }

}
