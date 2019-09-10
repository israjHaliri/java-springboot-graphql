package com.haliri.israj.javaspringbootgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.haliri.israj.javaspringbootgraphql.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserQuery implements GraphQLQueryResolver {

    public List<User> users() {
        List<User> users = new ArrayList<>();

        User aUser = new User();
        aUser.setId(1);
        aUser.setName("Israj Haliri");

        users.add(aUser);

        return users;
    }

    public User user(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("Israj Haliri");

        return user;
    }
}
