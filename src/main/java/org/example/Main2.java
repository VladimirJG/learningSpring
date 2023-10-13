package org.example;

import org.example.dao.MyApplicationContextConfiguration;
import org.example.dao.UserDao;
import org.example.model.User;
import org.example.util.DB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);

        UserDao dao = applicationContext.getBean(UserDao.class);
        User user1 = dao.findByFirstName("Mavrosia Nikiticna");
        User user2 = dao.findById(1);
        System.out.println(user1);
        System.out.println(user2);
        DB db = applicationContext.getBean(DB.class);
        System.out.println(db.getAll());
    }
}
