package com.hacker_bills.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.hacker_bills.entity.HackerBill;

@Component
public interface BillRepo extends JpaRepository<HackerBill, Long> {
	
	List<HackerBill> billsDueOnDate(String billedDate);

}
