package com.oasys.Customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oasys.Customer.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	/*@Query(value="select ifsc from bank.bank where branch=:b",nativeQuery=true)
	
	public String getByBranch(@Param("b") String ifsc);*/

}
