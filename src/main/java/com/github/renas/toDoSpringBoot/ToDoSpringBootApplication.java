package com.github.renas.toDoSpringBoot;

import com.github.renas.toDoSpringBoot.controller.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoSpringBootApplication.class, args);
		Controller controller = new Controller();

		System.out.println(controller.getNote("RENAS","USTEK"));
	}

}
