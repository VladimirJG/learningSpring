package org.example.dao;

import org.example.model.User;
import org.example.util.DB;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private final DB db;

    public UserService(DB db) {
        this.db = db;
    }

    public User get(Integer id) {
        return db.getAll().get(id);
    }

    public boolean add(User user){
        db.save(user);
        return db.getAll().containsValue(user.getId());
    }
}
