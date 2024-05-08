package com.ppp.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ppp.domain.Contact;
import com.ppp.repo.ContactRepo;

@Service
public class ContactService {

	private ContactRepo repo;

	public ContactService(ContactRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Contact> getMessage() {
		return this.repo.findAll();
	}

	public ResponseEntity<Contact> submitContact(Contact message) {
		Contact created = this.repo.save(message);
		return new ResponseEntity<Contact>(created, HttpStatus.CREATED);

	}

}
