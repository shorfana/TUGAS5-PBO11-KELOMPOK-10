/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.main;


import com.pengelolauangkaskosan.database.PenghuniDatabase;
import com.pengelolauangkaskosan.entity.Penghuni;
import com.pengelolauangkaskosan.error.PenghuniException;
import com.pengelolauangkaskosan.service.PenghuniDao;
import java.sql.SQLException;

/**
 *
 * @author Shorfana
 */
public class GUIBAGIAN1_TugasBesar_PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PenghuniException {
        // TODO code application logic here
        PenghuniDao dao = PenghuniDatabase.getPenghuniDao();
        Penghuni penghuni = new Penghuni();
        penghuni.setNama("iqbal s");
        penghuni.setNokmr("3");
        penghuni.setNolnt("1");
        penghuni.setNominal(90000);
        
        dao.insertPenghuni(penghuni);
    }
    
}
