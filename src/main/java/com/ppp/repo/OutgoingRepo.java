package com.ppp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppp.domain.Outgoing;

public interface OutgoingRepo extends JpaRepository<Outgoing, Integer> {

}
