package com.hacker_bills.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HackerBill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int billNumber;
	private String billedTo;
	private String billedDate;
	private int billedAmount;
	private int billTax;
	private int totalAmount;
	
}
