package org.example.dao;

import org.example.model.User;
import org.example.util.DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    private final DB db;

    public UserDao(DB db) {
        this.db = db;
    }

    public User findById(Integer id) {
        return db.getAll().get(id);
    }

    public User findByFirstName(String firstName) {
        return db.getAll().values().stream().filter(user -> user.getFirstName().equals(firstName)).toList().get(0);
    }
}
