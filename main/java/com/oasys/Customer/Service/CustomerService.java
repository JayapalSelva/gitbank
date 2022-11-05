package com.oasys.Customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.Customer.Dao.CustomerDao;
import com.oasys.Customer.Entity.Customer;
@Service
public class CustomerService {
	@Autowired
	CustomerDao custdao;

	public String addDetail(Customer c) {
		
		return custdao.addDetail(c);
	}

	public List<Customer> addList(List<Customer> c) {
		
		return custdao.addList(c);
	}

	/*public String getifsc(String str) {
		
		return custdao.getifsc(str);
	}*/

}
