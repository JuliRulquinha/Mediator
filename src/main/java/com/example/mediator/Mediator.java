package com.example.mediator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Mediator {
    private final Map<Class<?>, IHandler<?, ?>> handlers = new ConcurrentHashMap<>();

    public <TRequest extends IRequest<TResult>, TResult extends IResult>
    void registerHandler(Class<TRequest> requestType, IHandler<TRequest, TResult> handler) {
        handlers.put(requestType, handler);
    }

    public <TRequest extends IRequest<TResult>, TResult extends IResult>
    TResult send(TRequest request) {
        @SuppressWarnings("unchecked")
        IHandler<TRequest, TResult> handler = (IHandler<TRequest, TResult>) handlers.get(request.getClass());
        if (handler == null) {
            throw new IllegalArgumentException("No handler registered for " + request.getClass());
        }
        return handler.handle(request);
    }
}
