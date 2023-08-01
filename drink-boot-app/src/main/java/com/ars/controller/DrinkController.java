package com.ars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ars.entity.Drink;
import com.ars.repository.DrinkRepository;

@RestController
@RequestMapping("/drinks")
public class DrinkController {

	@Autowired
	DrinkRepository repository;
	@GetMapping("/all")
	public Iterable<Drink> findAll() {
		return repository.findAll();
	}
	
	@PostMapping("/create")
	//@ResponseStatus(HttpStatus.CREATED)	
	public Drink create(@RequestBody Drink drink) {
	return repository.save(drink);

	}
}