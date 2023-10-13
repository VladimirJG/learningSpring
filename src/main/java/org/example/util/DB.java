package org.example.util;

import org.example.model.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class DB {
    static AtomicInteger integer = new AtomicInteger(0);
    Map<Integer, User> userMap = new ConcurrentHashMap<>();

    {
        CreateUser.users.forEach(this::save);
    }

    public void save(User user) {
        if (user.getId() == null) {
            user.setId(integer.getAndIncrement());
        }
        userMap.put(user.getId(), user);
    }

    public  Map<Integer, User> getAll() {
        return userMap;
    }
}
