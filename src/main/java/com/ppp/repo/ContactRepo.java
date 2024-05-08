package com.ppp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppp.domain.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
