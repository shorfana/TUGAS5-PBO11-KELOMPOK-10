/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.model;

import com.pengelolauangkaskosan.entity.Penghuni;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Shorfana
 */
public class TabelBulanSblmModel extends AbstractTableModel {

   private List<Penghuni> list = new ArrayList<Penghuni>();

    public void setList(List<Penghuni> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {

        return list.size();
    }

    @Override
    public int getColumnCount() {

        return 5;
    }

    public boolean add(Penghuni e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
 
    }

    public Penghuni get(int i) {
        return list.get(i);
    }

    public Penghuni set(int i, Penghuni e) {
        try {
            return list.set(i, e);
        } finally {
            fireTableRowsUpdated(i, i);
        }
 
    }

    public Penghuni remove(int i) {
        try {
            return list.remove(i);
        } finally {
            fireTableRowsDeleted(i, i);
        }
 
    }
    
    
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "NAMA";
            case 2:
                return "NO KAMAR";
            case 3:
                return "NO LANTAI";
            case 4:
                return "NOMINAL";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getNokmr();
            case 3:
                return list.get(rowIndex).getNolnt();
            case 4:
                return list.get(rowIndex).getNominal();
            default:
                return null;

        }

    }
    
}
