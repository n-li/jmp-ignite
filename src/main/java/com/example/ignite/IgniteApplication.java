package com.example.ignite;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

public class IgniteApplication {

	private static PersonRepository repository;

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(IgniteCfg.class);

		ctx.refresh();

		repository = ctx.getBean(PersonRepository.class);

		savePersons();
	}

	private static void savePersons() {

		HashMap<Long, Person> persons = new HashMap<>();

		persons.put(1L, new Person(1L, "John Smith"));
		repository.save(persons);

		System.out.println(repository.findOne(1L).getFullName());
	}
}
