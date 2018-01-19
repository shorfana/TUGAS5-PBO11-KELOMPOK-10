/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.entity;

import java.util.Objects;

/**
 *
 * @author Shorfana
 */
public class Penghuni {
    private int id;
    private String nama;
    private String nokmr;
    private String nolnt;
    private int nominal;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.nama);
        hash = 53 * hash + Objects.hashCode(this.nokmr);
        hash = 53 * hash + Objects.hashCode(this.nolnt);
        hash = 53 * hash + this.nominal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Penghuni other = (Penghuni) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.nominal != other.nominal) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.nokmr, other.nokmr)) {
            return false;
        }
        if (!Objects.equals(this.nolnt, other.nolnt)) {
            return false;
        }
        return true;
    }

      
    
}
