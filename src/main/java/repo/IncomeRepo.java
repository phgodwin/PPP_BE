package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Income;

public interface IncomeRepo extends JpaRepository<Income, Integer> {

}
