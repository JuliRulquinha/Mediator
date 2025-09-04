package com.example.mediator;

public interface IHandler<TRequest extends IRequest<TResult>, TResult extends IResult> {
    TResult handle(TRequest request);
    Class<TRequest> getRequestType();
}
