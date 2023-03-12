package com.hscastro.rest.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hscastro.rest.domain.Person;
import com.hscastro.rest.repositories.PersonReposiory;

@Service
public class DBService {
	
	private LocalDate dataAtual = LocalDate.now();
	
	@Autowired
	private PersonReposiory repo;
	

	public void instanceDB() {
		Person p1 = new Person(1L, "Joao", "30223016004", "40223016003","masculino", "85 99734-3423", dataAtual);
		Person p2 = new Person(2L, "Maria", "73504848014", "43504848017", "feminino", "85 99635-4521", dataAtual);
		Person p3 = new Person(3L, "Pedro", "07167466034", "47167466030", "masculino","85 99523-2524", dataAtual);
		
		repo.save(p1);
		repo.save(p2);
		repo.save(p3);		
	}
}
