package com.ppp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppp.domain.Income;

public interface IncomeRepo extends JpaRepository<Income, Integer> {

}
