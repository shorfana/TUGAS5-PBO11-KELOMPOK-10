package com.pengelolauangkaskosan.view;

import com.pengelolauangkaskosan.controller.PenghuniController;
import com.pengelolauangkaskosan.entity.Penghuni;
import com.pengelolauangkaskosan.event.PenghuniListener;
import com.pengelolauangkaskosan.model.PenghuniModel;
import com.pengelolauangkaskosan.model.TabelBulanSkrngModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PanelInputDataView extends javax.swing.JPanel implements PenghuniListener, ListSelectionListener {

    private TabelBulanSkrngModel tabelModel;
    private PenghuniModel model;
    private PenghuniController controller;

    public PanelInputDataView() {
        tabelModel = new TabelBulanSkrngModel();
        model = new PenghuniModel();
        model.setListener(this);
        controller = new PenghuniController();
        controller.setModel(model);
        
       
        initComponents();
        tabelViewDataSekarang.getSelectionModel().addListSelectionListener(this);
    }

    public JTable getTabelViewDataSekarang() {
        return tabelViewDataSekarang;
    }

    public void setTabelViewDataSekarang(JTable tabelViewDataSekarang) {
        this.tabelViewDataSekarang = tabelViewDataSekarang;
    }

    public JTable getTabelViewDataSebelumnya() {
        return tabelViewDataSebelumnya;
    }

    public void setTabelViewDataSebelumnya(JTable tabelViewDataSebelumnya) {
        this.tabelViewDataSebelumnya = tabelViewDataSebelumnya;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JComboBox<String> getjNok() {
        return jNok;
    }

    public void setjNok(JComboBox<String> jNok) {
        this.jNok = jNok;
    }

    public JComboBox<String> getjNol() {
        return jNol;
    }

    public void setjNol(JComboBox<String> jNol) {
        this.jNol = jNol;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public void setTxtNama(JTextField txtNama) {
        this.txtNama = txtNama;
    }

    public JTextField getTxtNamaBarang() {
        return txtNamaBarang;
    }

    public void setTxtNamaBarang(JTextField txtNamaBarang) {
        this.txtNamaBarang = txtNamaBarang;
    }

    public JTextField getTxtNominal() {
        return txtNominal;
    }

    public void setTxtNominal(JTextField txtNominal) {
        this.txtNominal = txtNominal;
    }

    public JTextField getTxtNominalP() {
        return txtNominalP;
    }

    public void setTxtNominalP(JTextField txtNominalP) {
        this.txtNominalP = txtNominalP;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnInputData = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnViewData = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSistemPengeluaran = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnPenyajianData = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        inputData = new javax.swing.JPanel();
        txtInputData = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jNok = new javax.swing.JComboBox<>();
        jNol = new javax.swing.JComboBox<>();
        txtNominal = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewData = new javax.swing.JPanel();
        viewDataSekarang = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        viewDataSebelumnya = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        viewDataSekarang1 = new javax.swing.JPanel();
        txtDataSekarang = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelViewDataSekarang = new javax.swing.JTable();
        viewDataSebelumnya1 = new javax.swing.JPanel();
        txtDataSekarang1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelViewDataSebelumnya = new javax.swing.JTable();
        sistemPengeluaran = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSistemP = new javax.swing.JTable();
        btnHapusP = new javax.swing.JButton();
        btnEditP = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNamaBarang = new javax.swing.JTextField();
        txtNominalP = new javax.swing.JTextField();
        btnSimpanP = new javax.swing.JButton();
        viewPengeluaran = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        penyajianData = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu.setBackground(new java.awt.Color(59, 134, 134));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(121, 189, 154));

        btnInputData.setBackground(new java.awt.Color(255, 255, 255));
        btnInputData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInputData.setForeground(new java.awt.Color(11, 72, 107));
        btnInputData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInputData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pengelolauangkaskosan/icon/icInput.png"))); // NOI18N
        btnInputData.setText("Input Data");
        btnInputData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInputDataMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputData)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputData, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 60));

        jPanel2.setBackground(new java.awt.Color(121, 189, 154));

        btnViewData.setBackground(new java.awt.Color(255, 255, 255));
        btnViewData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewData.setForeground(new java.awt.Color(11, 72, 107));
        btnViewData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnViewData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pengelolauangkaskosan/icon/icView.png"))); // NOI18N
        btnViewData.setText("View Data");
        btnViewData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewDataMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnViewData)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnViewData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PanelMenu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, 60));

        jPanel3.setBackground(new java.awt.Color(121, 189, 154));

        btnSistemPengeluaran.setBackground(new java.awt.Color(255, 255, 255));
        btnSistemPengeluaran.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSistemPengeluaran.setForeground(new java.awt.Color(11, 72, 107));
        btnSistemPengeluaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pengelolauangkaskosan/icon/icSet.png"))); // NOI18N
        btnSistemPengeluaran.setText("Sistem Pengeluaran");
        btnSistemPengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSistemPengeluaranMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(btnSistemPengeluaran)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnSistemPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PanelMenu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 60));

        jPanel6.setBackground(new java.awt.Color(121, 189, 154));

        btnPenyajianData.setBackground(new java.awt.Color(168, 219, 168));
        btnPenyajianData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPenyajianData.setForeground(new java.awt.Color(11, 72, 107));
        btnPenyajianData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pengelolauangkaskosan/icon/icConvert.png"))); // NOI18N
        btnPenyajianData.setText("Penyajian Data");
        btnPenyajianData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPenyajianDataMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnPenyajianData)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnPenyajianData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelMenu.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 240, 60));

        jPanel7.setBackground(new java.awt.Color(121, 189, 154));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        PanelMenu.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 240, 60));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pengelolauangkaskosan/icon/iconApp.png"))); // NOI18N
        PanelMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 80));

        add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 590));

        mainPanel.setBackground(new java.awt.Color(121, 189, 154));
        mainPanel.setLayout(new java.awt.CardLayout());

        inputData.setBackground(new java.awt.Color(207, 240, 158));

        txtInputData.setBackground(new java.awt.Color(121, 189, 154));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(11, 72, 107));
        jLabel8.setText("Input Data Penghuni");

        javax.swing.GroupLayout txtInputDataLayout = new javax.swing.GroupLayout(txtInputData);
        txtInputData.setLayout(txtInputDataLayout);
        txtInputDataLayout.setHorizontalGroup(
            txtInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtInputDataLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(190, 190, 190))
        );
        txtInputDataLayout.setVerticalGroup(
            txtInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtInputDataLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel8)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(11, 72, 107));
        jLabel9.setText("Nama");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(11, 72, 107));
        jLabel10.setText("No Kamar");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(11, 72, 107));
        jLabel15.setText("No Lantai");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(11, 72, 107));
        jLabel16.setText("Nominal");

        txtNama.setBackground(new java.awt.Color(207, 240, 158));
        txtNama.setForeground(new java.awt.Color(11, 72, 107));
        txtNama.setBorder(null);

        jNok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", " " }));

        jNol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        txtNominal.setBackground(new java.awt.Color(207, 240, 158));
        txtNominal.setForeground(new java.awt.Color(11, 72, 107));
        txtNominal.setBorder(null);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(11, 72, 107));
        jLabel23.setText("No");

        txtId.setBackground(new java.awt.Color(207, 240, 158));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(11, 72, 107));
        jLabel1.setText("Rp.");

        javax.swing.GroupLayout inputDataLayout = new javax.swing.GroupLayout(inputData);
        inputData.setLayout(inputDataLayout);
        inputDataLayout.setHorizontalGroup(
            inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInputData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(inputDataLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(inputDataLayout.createSequentialGroup()
                        .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15)
                            .addComponent(jLabel23))
                        .addGap(56, 56, 56))
                    .addGroup(inputDataLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(jNol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jNok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNama)
                        .addComponent(txtNominal)
                        .addComponent(jSeparator2))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inputDataLayout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnReset)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputDataLayout.setVerticalGroup(
            inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jNok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jNol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnReset))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        mainPanel.add(inputData, "card2");

        viewData.setBackground(new java.awt.Color(207, 240, 158));

        viewDataSekarang.setBackground(new java.awt.Color(121, 189, 154));
        viewDataSekarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDataSekarangMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(11, 72, 107));
        jLabel11.setText("Lihat Data Bulan Sekarang");

        javax.swing.GroupLayout viewDataSekarangLayout = new javax.swing.GroupLayout(viewDataSekarang);
        viewDataSekarang.setLayout(viewDataSekarangLayout);
        viewDataSekarangLayout.setHorizontalGroup(
            viewDataSekarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataSekarangLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewDataSekarangLayout.setVerticalGroup(
            viewDataSekarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataSekarangLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel11)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        viewDataSebelumnya.setBackground(new java.awt.Color(121, 189, 154));
        viewDataSebelumnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDataSebelumnyaMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(11, 72, 107));
        jLabel13.setText("Lihat Data Bulan Sebelumnya");

        javax.swing.GroupLayout viewDataSebelumnyaLayout = new javax.swing.GroupLayout(viewDataSebelumnya);
        viewDataSebelumnya.setLayout(viewDataSebelumnyaLayout);
        viewDataSebelumnyaLayout.setHorizontalGroup(
            viewDataSebelumnyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataSebelumnyaLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel13)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        viewDataSebelumnyaLayout.setVerticalGroup(
            viewDataSebelumnyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataSebelumnyaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel13)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout viewDataLayout = new javax.swing.GroupLayout(viewData);
        viewData.setLayout(viewDataLayout);
        viewDataLayout.setHorizontalGroup(
            viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewDataSekarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewDataSebelumnya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        viewDataLayout.setVerticalGroup(
            viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(viewDataSekarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(viewDataSebelumnya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        mainPanel.add(viewData, "card3");

        viewDataSekarang1.setBackground(new java.awt.Color(207, 240, 158));

        txtDataSekarang.setBackground(new java.awt.Color(121, 189, 154));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(11, 72, 107));
        jLabel18.setText("View Data Sekarang");

        javax.swing.GroupLayout txtDataSekarangLayout = new javax.swing.GroupLayout(txtDataSekarang);
        txtDataSekarang.setLayout(txtDataSekarangLayout);
        txtDataSekarangLayout.setHorizontalGroup(
            txtDataSekarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtDataSekarangLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(67, 67, 67))
        );
        txtDataSekarangLayout.setVerticalGroup(
            txtDataSekarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtDataSekarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelViewDataSekarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "No Kamar", "No Lantai", "Nominal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelViewDataSekarang);

        javax.swing.GroupLayout viewDataSekarang1Layout = new javax.swing.GroupLayout(viewDataSekarang1);
        viewDataSekarang1.setLayout(viewDataSekarang1Layout);
        viewDataSekarang1Layout.setHorizontalGroup(
            viewDataSekarang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataSekarang1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(viewDataSekarang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDataSekarang1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDataSekarang1Layout.createSequentialGroup()
                        .addComponent(txtDataSekarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
        );
        viewDataSekarang1Layout.setVerticalGroup(
            viewDataSekarang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataSekarang1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtDataSekarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        mainPanel.add(viewDataSekarang1, "card4");

        viewDataSebelumnya1.setBackground(new java.awt.Color(207, 240, 158));

        txtDataSekarang1.setBackground(new java.awt.Color(121, 189, 154));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(11, 72, 107));
        jLabel19.setText("View Data Sebelumnya");

        javax.swing.GroupLayout txtDataSekarang1Layout = new javax.swing.GroupLayout(txtDataSekarang1);
        txtDataSekarang1.setLayout(txtDataSekarang1Layout);
        txtDataSekarang1Layout.setHorizontalGroup(
            txtDataSekarang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtDataSekarang1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(67, 67, 67))
        );
        txtDataSekarang1Layout.setVerticalGroup(
            txtDataSekarang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtDataSekarang1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelViewDataSebelumnya.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "No Kamar", "No Lantai", "Nominal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelViewDataSebelumnya);

        javax.swing.GroupLayout viewDataSebelumnya1Layout = new javax.swing.GroupLayout(viewDataSebelumnya1);
        viewDataSebelumnya1.setLayout(viewDataSebelumnya1Layout);
        viewDataSebelumnya1Layout.setHorizontalGroup(
            viewDataSebelumnya1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataSebelumnya1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(viewDataSebelumnya1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDataSebelumnya1Layout.createSequentialGroup()
                        .addComponent(txtDataSekarang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDataSebelumnya1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        viewDataSebelumnya1Layout.setVerticalGroup(
            viewDataSebelumnya1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataSebelumnya1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtDataSekarang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        mainPanel.add(viewDataSebelumnya1, "card5");

        sistemPengeluaran.setBackground(new java.awt.Color(207, 240, 158));

        jPanel4.setBackground(new java.awt.Color(121, 189, 154));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(11, 72, 107));
        jLabel12.setText("Sistem Pengeluaran");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(67, 67, 67))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelSistemP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Nama Barang", "Nominal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelSistemP);

        btnHapusP.setForeground(new java.awt.Color(11, 72, 107));
        btnHapusP.setText("Hapus");

        btnEditP.setForeground(new java.awt.Color(11, 72, 107));
        btnEditP.setText("Edit");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(11, 72, 107));
        jLabel14.setText("Nominal");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(11, 72, 107));
        jLabel17.setText("Nama Barang");

        btnSimpanP.setForeground(new java.awt.Color(11, 72, 107));
        btnSimpanP.setText("Simpan");

        javax.swing.GroupLayout sistemPengeluaranLayout = new javax.swing.GroupLayout(sistemPengeluaran);
        sistemPengeluaran.setLayout(sistemPengeluaranLayout);
        sistemPengeluaranLayout.setHorizontalGroup(
            sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sistemPengeluaranLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sistemPengeluaranLayout.createSequentialGroup()
                        .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sistemPengeluaranLayout.createSequentialGroup()
                                .addComponent(btnHapusP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditP))
                            .addGroup(sistemPengeluaranLayout.createSequentialGroup()
                                .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel14))
                                .addGap(41, 41, 41)
                                .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNominalP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSimpanP))))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sistemPengeluaranLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );
        sistemPengeluaranLayout.setVerticalGroup(
            sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sistemPengeluaranLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNominalP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnSimpanP)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapusP)
                    .addComponent(btnEditP))
                .addGap(127, 127, 127))
        );

        mainPanel.add(sistemPengeluaran, "card6");

        viewPengeluaran.setBackground(new java.awt.Color(207, 240, 158));

        jPanel9.setBackground(new java.awt.Color(121, 189, 154));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(11, 72, 107));
        jLabel22.setText("Lihat Hasil Data ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(49, 49, 49))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel22)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Nama Barang", "Nominal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout viewPengeluaranLayout = new javax.swing.GroupLayout(viewPengeluaran);
        viewPengeluaran.setLayout(viewPengeluaranLayout);
        viewPengeluaranLayout.setHorizontalGroup(
            viewPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPengeluaranLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(viewPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPengeluaranLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPengeluaranLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        viewPengeluaranLayout.setVerticalGroup(
            viewPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPengeluaranLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        mainPanel.add(viewPengeluaran, "card7");

        penyajianData.setBackground(new java.awt.Color(207, 240, 158));

        jPanel5.setBackground(new java.awt.Color(121, 189, 154));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(11, 72, 107));
        jLabel20.setText("Lihat Hasil Data PDF");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(49, 49, 49))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel20)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(121, 189, 154));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(11, 72, 107));
        jLabel21.setText("Lihat Hasil Data");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(65, 65, 65))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel21)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout penyajianDataLayout = new javax.swing.GroupLayout(penyajianData);
        penyajianData.setLayout(penyajianDataLayout);
        penyajianDataLayout.setHorizontalGroup(
            penyajianDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penyajianDataLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penyajianDataLayout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        penyajianDataLayout.setVerticalGroup(
            penyajianDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penyajianDataLayout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );

        mainPanel.add(penyajianData, "card8");

        add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 0, 550, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputDataMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(inputData);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnInputDataMouseClicked

    private void btnViewDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewDataMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(viewData);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnViewDataMouseClicked

    private void btnSistemPengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemPengeluaranMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(sistemPengeluaran);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnSistemPengeluaranMouseClicked

    private void btnPenyajianDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenyajianDataMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(penyajianData);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnPenyajianDataMouseClicked

    private void viewDataSekarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDataSekarangMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(viewDataSekarang1);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_viewDataSekarangMouseClicked

    private void viewDataSebelumnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDataSebelumnyaMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(viewDataSebelumnya1);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_viewDataSebelumnyaMouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(viewPengeluaran);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        controller.resetPenghuni(this);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        controller.insertPenghuni(this);
    }//GEN-LAST:event_btnSimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnEditP;
    private javax.swing.JButton btnHapusP;
    private javax.swing.JLabel btnInputData;
    private javax.swing.JLabel btnPenyajianData;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnSimpanP;
    private javax.swing.JLabel btnSistemPengeluaran;
    private javax.swing.JLabel btnViewData;
    private javax.swing.JPanel inputData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jNok;
    private javax.swing.JComboBox<String> jNol;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel penyajianData;
    private javax.swing.JPanel sistemPengeluaran;
    private javax.swing.JTable tabelSistemP;
    private javax.swing.JTable tabelViewDataSebelumnya;
    private javax.swing.JTable tabelViewDataSekarang;
    private javax.swing.JPanel txtDataSekarang;
    private javax.swing.JPanel txtDataSekarang1;
    private javax.swing.JTextField txtId;
    private javax.swing.JPanel txtInputData;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtNominal;
    private javax.swing.JTextField txtNominalP;
    private javax.swing.JPanel viewData;
    private javax.swing.JPanel viewDataSebelumnya;
    private javax.swing.JPanel viewDataSebelumnya1;
    private javax.swing.JPanel viewDataSekarang;
    private javax.swing.JPanel viewDataSekarang1;
    private javax.swing.JPanel viewPengeluaran;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(PenghuniModel pModel) {
        txtId.setText(pModel.getId() + "");
        txtNama.setText(pModel.getNama());
        jNok.setSelectedItem(pModel.getNokmr());
        jNol.setSelectedItem(pModel.getNolnt());
        txtNominal.setText(Integer.toString(pModel.getNominal()));
    }

    @Override
    public void onInsert(Penghuni penghuni) {
        tabelModel.add(penghuni);
    }

    @Override
    public void onDelete() {
        int index = tabelViewDataSekarang.getSelectedRow();
        tabelModel.remove(index);
    }

    @Override
    public void onUpdate(Penghuni penghuni) {
        int index = tabelViewDataSekarang.getSelectedRow();
        tabelModel.set(index, penghuni);
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        try {
            Penghuni model = tabelModel.get(tabelViewDataSekarang.getSelectedRow());
            txtId.setText(model.getId() + "");
            txtNama.setText(model.getNama());
            jNok.setSelectedItem(model.getNokmr());
            jNol.setSelectedItem(model.getNolnt());
            txtNominal.setText(Integer.toString(model.getNominal()));
        } catch (IndexOutOfBoundsException e) {
        }
    }

}
