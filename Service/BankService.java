package com.oasys.Bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.Bank.Dao.BankDao;
import com.oasys.Bank.Entity.Bank;
@Service
public class BankService {
	@Autowired
	BankDao bdao;

	public String AddDetail(Bank b) {
		
		return bdao.AddDetail(b);
	}

	public String getifsc(String s1, String s2) {
		
		return bdao.getifsc(s1,s2);
	}

	public String addlist(List<Bank> b) {
		
		return bdao.addlist(b);
	}

	
	}


