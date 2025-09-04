package com.example.mediator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mediator.commands.CreateUserCommand;
import com.example.mediator.handlers.CreateUserCommandHandler;


@SpringBootApplication
public class MediatorApplication {
	

	public static void main(String[] args) {
						
		SpringApplication.run(MediatorApplication.class, args);	

		// var mediator = new Mediator();
		// var command = new CreateUserCommand();
		// command.username = "DevilLady23";
		// command.email = "julinha.pdm10@gmail.com";
		// var handler =  new CreateUserCommandHandler();
		// mediator.registerHandler(CreateUserCommand.class, handler);

		// var result = mediator.send(command);
		// System.out.println(result.message);
	}

}
