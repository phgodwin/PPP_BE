package service;

import org.springframework.stereotype.Service;

import domain.Income;

import java.util.List;

import repo.IncomeRepo;

@Service
public class IncomeService {

	private IncomeRepo repo;

	public IncomeService(IncomeRepo repo) {
		super();
		this.repo = repo;
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Income> getIncome() {
        return this.repo.findAll();
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
