/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.pengelolauangkaskosan.implement.PenghuniDaoImpl;
import com.pengelolauangkaskosan.service.PenghuniDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Idham Rahadian
 */
public class PengelolauangkaskosanDatabase {
    
    private static Connection connection;
    
    private static PenghuniDao penghuniDao;
    
    public static Connection getConnection() throws SQLException{
        if (connection == null){
           MysqlDataSource dataSource = new MysqlDataSource();
           dataSource.setUrl("jdbc:mysql://localhost:3306/dbpengelolauangkaskosan");
           dataSource.setUser("root");
           dataSource.setPassword("");
           connection = dataSource.getConnection();    
       } return connection;       
    }
   
    public static PenghuniDao getPenghuniDao() throws SQLException{
        if (penghuniDao == null){
            penghuniDao = new PenghuniDaoImpl(getConnection());
        }
        return penghuniDao;
    }
    
}
