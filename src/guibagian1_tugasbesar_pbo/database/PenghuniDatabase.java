/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibagian1_tugasbesar_pbo.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import guibagian1_tugasbesar_pbo.impl.PenghuniDaoImpl;
import guibagian1_tugasbesar_pbo.service.PenghuniDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Shorfana
 */
public class PenghuniDatabase {
    private static Connection connection;
    private static PenghuniDao penghuniDao;
    
    public static Connection getConnection() throws SQLException{
        if (connection==null) {
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/dbpengelolakost");
            dataSource.setUser("root");
            dataSource.setPassword("");
            
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static PenghuniDao getPelangganDao() throws SQLException{
        if (penghuniDao == null) {
            penghuniDao = new PenghuniDaoImpl(getConnection());
        }
        return penghuniDao;
    }
}
