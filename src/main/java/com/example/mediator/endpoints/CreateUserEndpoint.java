package com.example.mediator.endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mediator.Mediator;
import com.example.mediator.commands.CreateUserCommand;
import com.example.mediator.handlers.CreateUserCommandHandler;
import com.example.mediator.results.CreateUserResult;

@RestController
@RequestMapping("/users")
public class CreateUserEndpoint {
    @PostMapping
    public CreateUserResult createUser(@RequestBody CreateUserCommand command){
        var handler = new CreateUserCommandHandler();
        var mediator = new Mediator();
        mediator.registerHandler(CreateUserCommand.class, handler);
        return mediator.send(command);
    }
}
