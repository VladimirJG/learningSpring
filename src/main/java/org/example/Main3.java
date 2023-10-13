package org.example;

import org.example.dao.MyApplicationContextConfiguration;
import org.example.dao.UserService;
import org.example.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);

        UserService service = context.getBean(UserService.class);

        service.add(new User("Papa", "Roach", 35));
        User user1 = service.get(5);
        System.out.println(user1);
    }
}
