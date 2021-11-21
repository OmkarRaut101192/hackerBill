package com.hacker_bills.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hacker_bills.entity.HackerBill;
import com.hacker_bills.service.ServiceBill;

@RestController
@RequestMapping("/hacker")
public class ControllerBill {

	@Autowired
	ServiceBill billService;
	
	@GetMapping("/bills/{id}")
	public HackerBill billGetById(@PathVariable Long id) {
		return billService.getBillById(id);
	}
	
	@GetMapping("/bills/due/{date}")
	public List<HackerBill> billGetByDueDate(@PathVariable String date) {
		return billService.dueBillOnDate(date);
	}
	
	
	
}
