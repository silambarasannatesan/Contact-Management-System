package com.simtech.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simtech.springboot.model.Contact;

/**
 * @author silambarasan
 *
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {

	Contact findByName(String name);
}
