package in.gaurav.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.gaurav.bindings.Customer;

@RestController
public class CustomerController {

	@PutMapping(value = "/update",consumes = {"application/xml","application/json"}
	,produces = {"application/xml","application/json"})
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
		//logic to update customer
		System.out.println(customer);
		return new ResponseEntity<String>("Update Successfully", HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete/{customerId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer customerId) {
		//logic to delete customer
		System.out.println(customerId);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}
}
