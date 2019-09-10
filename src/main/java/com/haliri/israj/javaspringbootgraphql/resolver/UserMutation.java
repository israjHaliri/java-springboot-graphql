package com.haliri.israj.javaspringbootgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.haliri.israj.javaspringbootgraphql.model.User;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class UserMutation implements GraphQLMutationResolver {

    public User createUser(String name) {
        AtomicInteger atomicInteger = new AtomicInteger();
        return new User(atomicInteger.incrementAndGet(), "Hello this is dummy data");
    }
}