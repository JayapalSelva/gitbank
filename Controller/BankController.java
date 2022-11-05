package com.oasys.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.Bank.Entity.Bank;
import com.oasys.Bank.Service.BankService;

@RestController
public class BankController {
	@Autowired
	BankService bankser;
	
	@PostMapping("/add")
	public String AddDetail(@RequestBody Bank b) {
		return bankser.AddDetail(b);
	}
	
	@PostMapping("addlistbank")
	public String addlist(@RequestBody List <Bank>b) {
		return bankser.addlist(b);
	}
	
	@GetMapping("/getifsc/{s1}/{s2}")
	public String getifsc(@PathVariable String s1,@PathVariable String s2) {
		
		return bankser.getifsc(s1,s2);
	}
}
