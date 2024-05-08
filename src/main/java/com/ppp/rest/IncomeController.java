package com.ppp.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ppp.domain.Income;
import com.ppp.service.IncomeService;

@RestController
@CrossOrigin
@RequestMapping("/Income")

public class IncomeController {

	private IncomeService service;

	public IncomeController(IncomeService service) {
		super();
		this.service = service;
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/getIncomes")
	public List<Income> getIncomes() {
		return service.getIncomes();
	}

	@GetMapping("getIncome/{id}")
	public Optional<Income> getIncome(@PathVariable int id) {
		return service.getIncome(id);
	}

	@PostMapping("/addIncome")
	public Income addIncome(@RequestBody Income income) {
		return service.addIncome(income);
	}

	@PutMapping("/updateIncome")
	public Income updateIncome(@RequestBody Income income) {
		return service.updateIncome(income);
	}

	@DeleteMapping("/deleteIncome/{id}")
	public void deleteIncome(@PathVariable int id) {
		service.deleteIncome(id);
	}
}
