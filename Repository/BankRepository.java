package com.oasys.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oasys.Bank.Entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer>{
	
	@Query(value="Select ifsc from bank.bank where name=:a and branch=:b",nativeQuery = true)
	
	public String getbynamebranch(@Param("a")String a,@Param("b")String b);
	
	
	

}
