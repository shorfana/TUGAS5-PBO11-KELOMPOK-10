/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.model;

import com.pengelolauangkaskosan.database.PenghuniDatabase;
import com.pengelolauangkaskosan.entity.Penghuni;
import com.pengelolauangkaskosan.error.PenghuniException;
import com.pengelolauangkaskosan.event.PenghuniListener;
import com.pengelolauangkaskosan.service.PenghuniDao;
import java.sql.SQLException;

/**
 *
 * @author Shorfana
 */
public class PenghuniModel {
    private int id;
    private String nama;
    private String nokmr;
    private String nolnt;
    private int nominal;

    private PenghuniListener listener;

    public PenghuniListener getListener() {
        return listener;
    }

    public void setListener(PenghuniListener listener) {
        this.listener = listener;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        fireOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getNokmr() {
        return nokmr;
    }

    public void setNokmr(String nokmr) {
        this.nokmr = nokmr;
        fireOnChange();
    }

    public String getNolnt() {
        return nolnt;
    }

    public void setNolnt(String nolnt) {
        this.nolnt = nolnt;
        fireOnChange();
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
        fireOnChange();
    }

    protected void fireOnChange() {
        if (listener != null) {
            listener.onChange(this);
        }
    }

    protected void fireOnInsert(Penghuni penghuni) {
        if (listener != null) {
            listener.onInsert(penghuni);
        }
    }

    protected void fireOnUpdate(Penghuni penghuni) {
        if (listener != null) {
            listener.onUpdate(penghuni);
        }
    }

    protected void fireOnDelete() {
        if (listener != null) {
            listener.onDelete();
        }
    }

    public void insertPenghuni() throws SQLException, PenghuniException {
        PenghuniDao dao = PenghuniDatabase.getPenghuniDao();
        Penghuni penghuni = new Penghuni();

        penghuni.setNama(nama);
        penghuni.setNokmr(nokmr);
        penghuni.setNolnt(nolnt);
        penghuni.setNominal(nominal);

        dao.insertPenghuni(penghuni);

        fireOnInsert(penghuni);
    }

    public void updatePenghuni() throws SQLException, PenghuniException {
        PenghuniDao dao = PenghuniDatabase.getPenghuniDao();
        Penghuni penghuni = new Penghuni();

        penghuni.setNama(nama);
        penghuni.setNokmr(nokmr);
        penghuni.setNolnt(nolnt);
        penghuni.setNominal(nominal);
        penghuni.setId(id);
        dao.updatePenghuni(penghuni);

        fireOnUpdate(penghuni);
    }

    public void deletePnghuni() throws SQLException, PenghuniException {
        PenghuniDao dao = PenghuniDatabase.getPenghuniDao();
        dao.deletePenghuni(id);
        fireOnDelete();
    }
    
    public void resetPenghuni(){
        setId(0);
        setNama("");
        setNokmr("");
        setNolnt("");
        setNominal(0);
    }


    
    
    
}
