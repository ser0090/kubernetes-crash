package com.in28minutes.springboot.web.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.web.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
	/* Jpa Repository an abstraction on top of JPA to make easier talk
	 whit DB */
	List<Todo> findByUser(String user);
}