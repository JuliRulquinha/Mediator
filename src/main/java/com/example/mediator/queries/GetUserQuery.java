package com.example.mediator.queries;

import com.example.mediator.IRequest;
import com.example.mediator.results.GetUserResult;

public class GetUserQuery implements IRequest<GetUserResult> {
    public String username;
}
