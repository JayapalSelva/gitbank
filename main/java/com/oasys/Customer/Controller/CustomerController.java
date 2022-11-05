package com.oasys.Customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.Customer.Entity.Customer;
import com.oasys.Customer.Service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService custser;
	
	@PostMapping(value="/addifsc")
	public String addDetail(@RequestBody Customer c) {
		return custser.addDetail(c);
	}
	
	@PostMapping("/addlist")
	public List<Customer>addList(@RequestBody List <Customer> c){
		return custser.addList(c);
		
	}
	
	
	
	/*@GetMapping(value="/getifsc/{str}")
	public String getifsc (@PathVariable String str) {
		return custser.getifsc(str);
		
	}*/

}
