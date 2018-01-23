/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.model;

/**
 *
 * @author Shorfana
 */
public class IsiSetPengModel {
    private int Id;
    private String namaBarang;
    private int Nominal;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getNominal() {
        return Nominal;
    }

    public void setNominal(int Nominal) {
        this.Nominal = Nominal;
    }
    
    
}
