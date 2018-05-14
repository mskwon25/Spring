package com.spring.bootcamp.dao;

import com.spring.bootcamp.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author minseok.kwon@nhnent.com
 * @since 2018-05-14
 */
public class UserDaoTest {
    @Test
    public void addAndGet() throws SQLException {
        org.springframework.context.ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);

        User user = new User();
        user.setId("tokigoki");
        user.setName("이성경");
        user.setPassword("heybiblee");

        dao.add(user);
        User user2 = dao.get(user.getId());

        assertThat(user2.getName(), is(user.getName()));
        assertThat(user2.getPassword(), is(user.getPassword()));
    }
}