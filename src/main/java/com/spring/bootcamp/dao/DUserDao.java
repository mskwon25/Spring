package com.spring.bootcamp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author minseok.kwon@nhnent.com
 * @since 2018-04-26
 */
public class DUserDao extends UserDao{

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/book", "root", "eodeoddl7@");
        return c;
    }
}