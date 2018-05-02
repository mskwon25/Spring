package com.spring.bootcamp.dao;

import com.spring.bootcamp.domain.User;

/**
 * @author minseok.kwon@nhnent.com
 * @since 2018-05-02
 */
public class DaoFactory {
    public UserDao userDao() {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);
        return userDao;
    }
}