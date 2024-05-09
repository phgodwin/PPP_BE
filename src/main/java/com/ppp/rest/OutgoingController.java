package com.ppp.rest;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ppp.domain.Outgoing;
import com.ppp.service.OutgoingService;

@RestController
@CrossOrigin
@RequestMapping("/Outgoing")

public class OutgoingController {

	private OutgoingService service;

	public OutgoingController(OutgoingService service) {
		super();
		this.service = service;
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/getOutgoings")
	public List<Outgoing> getOutgoings() {
		return service.getOutgoings();
	}

	@PostMapping("/addOutgoing")
	public Outgoing addOutgoing(@RequestBody Outgoing outgoing) {
		return service.addOutgoing(outgoing);
	}

	@PutMapping("/updateOutgoing")
	public Outgoing updateOutgoing(@RequestBody Outgoing outgoing) {
		return service.updateOutgoing(outgoing);
	}

	@DeleteMapping("/deleteOutgoing/{id}")
	public void deleteOutgoing(@PathVariable int id) {
		service.deleteOutgoing(id);
	}

	@DeleteMapping("/clearOutgoings")
	public void clearOutgoings() {
		service.clearOutgoings();
	}

}
