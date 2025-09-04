package com.example.mediator.handlers;

import org.springframework.stereotype.Component;

import com.example.mediator.IHandler;
import com.example.mediator.commands.CreateUserCommand;
import com.example.mediator.results.CreateUserResult;

@Component
public class CreateUserCommandHandler implements IHandler<CreateUserCommand, CreateUserResult> {

    @Override
    public CreateUserResult handle(CreateUserCommand request) {

        var result = new CreateUserResult();
        result.success = request.email != null 
                            && request.username != null 
                            && !request.email.isEmpty() 
                            && !request.username.isEmpty()?true:false;
        result.message = "Created user: "+ request.username;
        return result;
    }

    @Override
    public Class<CreateUserCommand> getRequestType() {
        return CreateUserCommand.class;
    }

}
