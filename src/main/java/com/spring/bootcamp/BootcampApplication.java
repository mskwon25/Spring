package com.spring.bootcamp;

import com.spring.bootcamp.dao.ConnectionMaker;
import com.spring.bootcamp.dao.DConnectionMaker;
import com.spring.bootcamp.dao.DaoFactory;
import com.spring.bootcamp.dao.UserDao;
import com.spring.bootcamp.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class BootcampApplication {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionMaker connectionMaker = new DConnectionMaker();

        UserDao dao = new DaoFactory().userDao();

        User user = new User();
        user.setId("tokigoki");
        user.setName("이성경");
        user.setPassword("heybiblee");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " 조회 성공");

        SpringApplication.run(BootcampApplication.class, args);
    }
}
