package com.ppp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ppp.domain.Outgoing;
import com.ppp.repo.OutgoingRepo;

@Service
public class OutgoingService {

	private OutgoingRepo repo;

	public OutgoingService(OutgoingRepo repo) {
		super();
		this.repo = repo;
		// TODO Auto-generated constructor stub
	}

	public void clearOutgoings() {
		repo.deleteAll();
	}

	public List<Outgoing> getOutgoings() {
		return this.repo.findAll();
	}

	public Outgoing addOutgoing(Outgoing outgoing) {
		return this.repo.save(outgoing);
	}

	public Outgoing updateOutgoing(Outgoing outgoing) {
		return this.repo.save(outgoing);
	}

	public void deleteOutgoing(int id) {
		this.repo.deleteById(id);
	}
}
