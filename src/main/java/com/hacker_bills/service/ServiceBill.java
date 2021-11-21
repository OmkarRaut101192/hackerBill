package com.hacker_bills.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.hacker_bills.dao.BillRepo;
import com.hacker_bills.entity.HackerBill;

@Service
public class ServiceBill {

	@Autowired
	BillRepo repoBill;

//	public HackerBill saveData(HackerBill hbill) {
//		return repoBill.save(hbill);
//	} 
	
	public HackerBill getBillById(Long id) {
		return repoBill.getById(id);
	}
	
	public List<HackerBill> dueBillOnDate(String billed_date) {
		return repoBill.billsDueOnDate(billed_date);
	}
}
