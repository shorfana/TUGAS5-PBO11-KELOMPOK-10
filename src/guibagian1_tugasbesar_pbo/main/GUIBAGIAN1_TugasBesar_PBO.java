/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibagian1_tugasbesar_pbo.main;


import guibagian1_tugasbesar_pbo.database.PenghuniDatabase;
import guibagian1_tugasbesar_pbo.entity.Penghuni;
import guibagian1_tugasbesar_pbo.error.PenghuniException;
import guibagian1_tugasbesar_pbo.service.PenghuniDao;
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
        PenghuniDao dao = PenghuniDatabase.getPelangganDao();
        Penghuni penghuni = new Penghuni();
        penghuni.setNama("iqbal s");
        penghuni.setNokmr("3");
        penghuni.setNolnt("1");
        penghuni.setNominal(90000);
        
        dao.insertPenghuni(penghuni);
    }
    
}
