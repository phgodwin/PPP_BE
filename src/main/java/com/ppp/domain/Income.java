package com.ppp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Income {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private float takeHomePay;

	private float additionalIncome;

	public Income() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getTakeHomePay() {
		return takeHomePay;
	}

	public void setTakeHomePay(float takeHomePay) {
		this.takeHomePay = takeHomePay;
	}

	public float getAdditionalIncome() {
		return additionalIncome;
	}

	public void setAdditionalIncome(float additionalIncome) {
		this.additionalIncome = additionalIncome;
	}

}
