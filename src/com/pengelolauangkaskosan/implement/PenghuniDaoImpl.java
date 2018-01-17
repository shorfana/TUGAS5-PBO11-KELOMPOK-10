/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.implement;

import com.pengelolauangkaskosan.entity.Penghuni;
import com.pengelolauangkaskosan.service.PenghuniDao;
import com.pengelolaunagkaskosan.exception.PenghuniException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Idham Rahadian
 */
public class PenghuniDaoImpl implements PenghuniDao {

    private final Connection connection;

    private final String insertPenghuni = "INSERT INTO PENGHUNI"
            + "(NAMA, NOKAMAR, NOLANTAI, NOMINAL) VALUES"
            + "(?,?,?,?)";
    
    private final String getById = "SELECT * FROM PENGHUNI WHERE ID = ?";
    
    private final String selectAll = "SELECT *FROM PENGHUNI";

    public PenghuniDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertPenghuni(Penghuni penghuni) throws PenghuniException {

        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(insertPenghuni);
            statement.setString(1, penghuni.getNama());
            statement.setString(2, penghuni.getNoKamar());
            statement.setString(3, penghuni.getNoLantai());
            statement.setInt(4, penghuni.getNominal());
            statement.executeUpdate();

        } catch (SQLException exception) {
            throw new PenghuniException(exception.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {

                }
            }

        }
    
    }

    @Override
        public void updatePenghuni(Penghuni penghuni) throws PenghuniException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public void deletePenghuni(Integer id) throws PenghuniException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public Penghuni getPenghuni(Integer id) throws PenghuniException {
            PreparedStatement statement = null;
            try{
                statement = connection.prepareStatement(getById);
                statement.setInt(1, id);
                
                ResultSet result = statement.executeQuery();
                Penghuni penghuni = null;
                if (result.next()){
                    penghuni = new Penghuni();
                    penghuni.setId(result.getInt("ID"));
                    penghuni.setNama(result.getString("NAMA"));
                    penghuni.setNoKamar(result.getString("NOKAMAR"));
                    penghuni.setNoLantai(result.getString("NOLANTAI"));
                    penghuni.setNominal(result.getInt("NOMINAL"));
                }else{
                    throw new PenghuniException("Penghuni dengan id "
                    + id + " tidak ditemukan");
                }
                return penghuni;
            } catch (SQLException e){
                throw new PenghuniException(e.getMessage());
            } finally {
                if (statement != null){
                    try{
                        statement.close();
                    } catch (SQLException exception){
                        
                    }
                }
            }
       }

    @Override
        public List<Penghuni> selectAllPenghuni() throws PenghuniException {
            Statement statement = null;
            List<Penghuni> list = new ArrayList<Penghuni>();
            try{
                statement = connection.createStatement();
                
                ResultSet result = statement.executeQuery(selectAll);
                while (result.next()){
                    Penghuni penghuni = new Penghuni();
                    penghuni.setId(result.getInt("ID"));
                    penghuni.setNama(result.getString("NAMA"));
                    penghuni.setNoKamar(result.getString("NOKAMAR"));
                    penghuni.setNoLantai(result.getString("NOLANTAI"));
                    penghuni.setNominal(result.getInt("NOMINAL"));
                    
                    list.add(penghuni);
                }
                return list;
            }catch (SQLException exception){
                throw new PenghuniException(exception.getMessage());
            }finally{
                if (statement != null){
                    try{
                        statement.close();
                    } catch (SQLException exception){
                        
                    }
                }
                
            }
            
        
    }

}
