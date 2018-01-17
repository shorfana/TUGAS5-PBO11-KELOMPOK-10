/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.entity;

import java.util.Objects;

/**
 *
 * @author Idham Rahadian
 */
public class Penghuni {
    
    private int id;
    private String nama;
    private String noKamar;
    private String noLantai;
    private int nominal;

    public Penghuni(String nama, String noKamar, String noLantai, int nominal) {
        this.nama = nama;
        this.noKamar = noKamar;
        this.noLantai = noLantai;
        this.nominal = nominal;
    }

    public Penghuni(){
        
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

    public String getNoKamar() {
        return noKamar;
    }

    public void setNoKamar(String noKamar) {
        this.noKamar = noKamar;
    }

    public String getNoLantai() {
        return noLantai;
    }

    public void setNoLantai(String noLantai) {
        this.noLantai = noLantai;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.id;
        hash = 73 * hash + Objects.hashCode(this.nama);
        hash = 73 * hash + Objects.hashCode(this.noKamar);
        hash = 73 * hash + Objects.hashCode(this.noLantai);
        hash = 73 * hash + this.nominal;
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
        if (!Objects.equals(this.noKamar, other.noKamar)) {
            return false;
        }
        if (!Objects.equals(this.noLantai, other.noLantai)) {
            return false;
        }
        return true;
    }
    
    
    
}
