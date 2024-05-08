package service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import domain.Income;
import repo.IncomeRepo;

@Service
public class IncomeService {

	private IncomeRepo repo;

	public IncomeService(IncomeRepo repo) {
		super();
		this.repo = repo;
		// TODO Auto-generated constructor stub
	}

	public List<Income> getIncomes() {
		return this.repo.findAll();
	}

	public Optional<Income> getIncome(int id) {
		return this.repo.findById(id);
	}

	public Income addIncome(Income income) {
		return this.repo.save(income);
	}

	public Income updateIncome(Income income) {
		return this.repo.save(income);
	}

	public void deleteIncome(int id) {
		this.repo.deleteById(id);
	}

}
