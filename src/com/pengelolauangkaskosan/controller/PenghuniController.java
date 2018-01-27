package com.pengelolauangkaskosan.controller;

import com.pengelolauangkaskosan.model.PenghuniModel;

import com.pengelolauangkaskosan.view.PanelInputDataView;
import javax.swing.JOptionPane;

public class PenghuniController {

    private PenghuniModel model;

    public void setModel(PenghuniModel model) {
        this.model = model;
    }

    public void resetPenghuni(PanelInputDataView view) {
        model.resetPenghuni();
    }

    public void insertPenghuni(PanelInputDataView view) {
        String nama = view.getTxtNama().getText();
        String noKmr = view.getjNok().getSelectedItem().toString();
        String noLnt = view.getjNol().getSelectedItem().toString();
        int nominal = (Integer.parseInt(view.getTxtNominal().getText()));

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Tidak Boleh Kosong");
        } else {
            model.setNama(nama);
            model.setNokmr(noKmr);
            model.setNolnt(noLnt);
            model.setNominal(nominal);
            

            try {
                model.insertPenghuni();
                JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
                model.resetPenghuni();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Eror di database dengan pesan", e.getMessage()});
            }
        }

    }

    public void updatePenghuni(PanelInputDataView view) {
        if (view.getTabelViewDataSekarang().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan seleksi baris data yang akan diubah");
            return;
        }

        Integer id = Integer.parseInt(view.getTxtId().toString());
        String nama = view.getTxtNama().getText();
        String noKmr = view.getjNok().getSelectedItem().toString();
        String noLnt = view.getjNol().getSelectedItem().toString();
        String nominal = view.getTxtNominal().getText();

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Tidak Boleh Kosong");
        } else {
            model.setId(id);
            model.setNama(nama);

            try {
                model.updatePenghuni();
                JOptionPane.showMessageDialog(view, "Data Berhasil Diubah");
                model.resetPenghuni();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Eror di database dengan pesan", e.getMessage()});
            }
        }
    }

    public void deletePenghuni(PanelInputDataView view) {
        if (view.getTabelViewDataSekarang().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan seleksi baris data yang akan dihapus");
            return;
        }
        
        if (JOptionPane.showConfirmDialog(view, "Anda yakin ingin menghapus?")==JOptionPane.OK_OPTION) {
            Integer id = Integer.parseInt(view.getTxtId().getText());
            model.setId(id);
            
            try {
                model.deletePnghuni();
                JOptionPane.showMessageDialog(view, "Penghuni Berhasil Diubah");
                model.resetPenghuni();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Eror di database dengan pesan", e.getMessage()}); 
            }
        }
    }

}
