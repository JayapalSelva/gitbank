package com.oasys.Bank.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.Bank.Entity.Bank;
import com.oasys.Bank.Repository.BankRepository;
@Repository

public class BankDao {
@Autowired
BankRepository brepo;

	public String AddDetail(Bank b) {
		brepo.save(b);
		return "SUCESSFULLY ADDED";
	}

	public String getifsc(String s1, String s2) {
		
		return brepo.getbynamebranch(s1, s2);
		
	}

	public String addlist(List<Bank> b) {
		
		 brepo.saveAll(b);
		 return "Add LIST OF BANK SUCECSSFULLY";
	}

}
