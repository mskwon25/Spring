package com.spring.bootcamp.dao;

import com.spring.bootcamp.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
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
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);


        User user1 = new User("heybiblee", "이성경", "qwer1234");
        User user2 = new User("dlwlrma", "이지은", "qwer1234");

        dao.deleteAll();
        assertThat(dao.getCount(), is(0));

        dao.add(user1);
        dao.add(user2);
        assertThat(dao.getCount(), is(2));

        User userget1 = dao.get(user1.getId());
        assertThat(userget1.getName(), is(userget1.getName()));
        assertThat(userget1.getPassword(), is(userget1.getPassword()));

        User userget2 = dao.get(user2.getId());
        assertThat(userget2.getName(), is(userget2.getName()));
        assertThat(userget2.getPassword(), is(userget2.getPassword()));
    }

    @Test
    public void count() throws SQLException {
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);

        UserDao dao = context.getBean("userDao", UserDao.class);
        User user1 = new User("heybiblee", "이성경", "qwer1234");
        User user2 = new User("dlwlrma", "이지은", "qwer1234");

        dao.deleteAll();
        assertThat(dao.getCount(), is(0));

        dao.add(user1);
        assertThat(dao.getCount(), is(1));

        dao.add(user2);
        assertThat(dao.getCount(), is(2));
    }
}