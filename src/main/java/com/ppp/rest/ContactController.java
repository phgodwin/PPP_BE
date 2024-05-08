package com.ppp.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ppp.domain.Contact;
import com.ppp.service.ContactService;

@RequestMapping("/message")
@CrossOrigin
@RestController
public class ContactController {

	private final ContactService service;

	public ContactController(ContactService service) {
		this.service = service;
	}

	@GetMapping("/getAll")
	public List<Contact> getMessage() {
		return this.service.getMessage();
	}

	@PostMapping("/submit")
	public ResponseEntity<Contact> submitContact(@RequestBody Contact message) {
		return this.service.submitContact(message);

	}

}
