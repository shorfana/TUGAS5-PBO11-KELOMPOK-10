/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.model;

import com.pengelolauangkaskosan.event.PenghuniListener;

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
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNokmr() {
        return nokmr;
    }

    public void setNokmr(String nokmr) {
        this.nokmr = nokmr;
    }

    public String getNolnt() {
        return nolnt;
    }

    public void setNolnt(String nolnt) {
        this.nolnt = nolnt;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }
    
    
}
