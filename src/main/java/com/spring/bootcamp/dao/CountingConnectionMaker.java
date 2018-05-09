package com.spring.bootcamp.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author minseok.kwon@nhnent.com
 * @since 2018-05-09
 */
public class CountingConnectionMaker implements ConnectionMaker {

    int count = 0;
    private ConnectionMaker realConnectionMaker;

    public CountingConnectionMaker countingConnectionMaker(ConnectionMaker realConnectionMaker) {
        this.realConnectionMaker = realConnectionMaker;
    }

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        this.count++;
        return realConnectionMaker.makeConnection();
    }

    public int getCount() {
        return this.count;
    }
}