package com.oasys.Customer.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.oasys.Customer.Entity.Customer;
import com.oasys.Customer.Repository.CustomerRepository;

@Repository
public class CustomerDao {
	@Autowired
	
	CustomerRepository custRepo;
@Autowired
RestTemplate rest;

	public String addDetail(Customer c) {
		String url="http://localhost:8081/getifsc/ /";
		
		String val=c.getName();
		String val2=c.getBranch();
		ResponseEntity<String> res1=rest.exchange(url+val+"/"+val2,HttpMethod.GET,null,String.class);
		String ifsc1=res1.getBody();
		c.setIfsc(ifsc1);
		custRepo.save(c);
		
		return "Detail Added Successfully";
	}

	public List<Customer> addList(List<Customer> c) {
		/*String urllink="http://localhost:8081/getifsc/ /";
		c.forEach(x->{
		String a=x.getName();
		String b=x.getBranch();
		ResponseEntity<List>res=rest.exchange(urllink, null)
				);*/
		return null;
	}

	/*public String getifsc(String str) {
		
		return custRepo.getByBranch(str);
	}*/

}
