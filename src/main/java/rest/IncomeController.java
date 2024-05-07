package rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import domain.Income;
import service.IncomeService;

@RestController

public class IncomeController {

		private IncomeService service;
		
	public IncomeController(IncomeService service) {
		super();
		this.service = service;
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/getIncome")
	public List<Income> getIncome() {
		return service.getIncome();
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
