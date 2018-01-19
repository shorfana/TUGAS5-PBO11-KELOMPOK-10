/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.service;

import com.pengelolauangkaskosan.entity.Penghuni;
import com.pengelolauangkaskosan.error.PenghuniException;
import java.util.List;

/**
 *
 * @author Shorfana
 */
public interface PenghuniDao {
    public void insertPenghuni(Penghuni penghuni) throws PenghuniException;
    public void updatePenghuni(Penghuni penghuni) throws PenghuniException;
    public void deletePenghuni(Integer id) throws PenghuniException;
    public Penghuni getPenghuni(Integer id) throws PenghuniException;
    public List<Penghuni> selectAllPelanggan() throws PenghuniException;
}
