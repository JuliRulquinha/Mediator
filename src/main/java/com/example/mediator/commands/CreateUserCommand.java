package com.example.mediator.commands;

import com.example.mediator.IRequest;
import com.example.mediator.results.CreateUserResult;

public class CreateUserCommand implements IRequest<CreateUserResult> {
    public String username;
    public String email;
}
