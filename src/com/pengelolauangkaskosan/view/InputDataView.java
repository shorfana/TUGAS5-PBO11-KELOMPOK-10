/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.view;

import com.pengelolauangkaskosan.model.TabelBulanSblmModel;
import com.pengelolauangkaskosan.model.TabelBulanSkrngModel;
import com.pengelolauangkaskosan.model.TabelPengeluaranModel;
import com.pengelolauangkaskosan.model.TabelSistemPengModel;
import javax.swing.JOptionPane;

public class InputDataView extends javax.swing.JPanel {

    private TabelBulanSblmModel sblmModel;
    private TabelBulanSkrngModel skrngModel;
    private TabelPengeluaranModel pModel;
    private TabelSistemPengModel sModel;
    
    public InputDataView() {
        sblmModel = new TabelBulanSblmModel();
        skrngModel = new TabelBulanSkrngModel();
        pModel = new TabelPengeluaranModel();
        sModel = new TabelSistemPengModel();
        
        initComponents();
        tabelBlnSkrng.setModel(skrngModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        menuPanel = new javax.swing.JPanel();
        btnInputdata = new javax.swing.JLabel();
        btnViewdata = new javax.swing.JLabel();
        btnsistem = new javax.swing.JLabel();
        btnpenyajian = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        inputData = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnSimpan = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        viewData = new javax.swing.JPanel();
        btnBlnSkrng = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBlnSblm = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        setPblnSblm = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBlnSblm = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        setPblnSkrg = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelBlnSkrng = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        viewPengeluaran = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelPengeluaran = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        sistemPengeluaran = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelSistemPeng = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        btnSimpanSetpeng = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        penyajianData = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 500));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        menuPanel.setBackground(new java.awt.Color(0, 150, 136));

        btnInputdata.setForeground(new java.awt.Color(153, 0, 153));
        btnInputdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/moneyhome.png"))); // NOI18N
        btnInputdata.setText("Input Data");
        btnInputdata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInputdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInputdataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInputdataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInputdataMouseExited(evt);
            }
        });

        btnViewdata.setForeground(new java.awt.Color(153, 0, 153));
        btnViewdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view.png"))); // NOI18N
        btnViewdata.setText("View Data");
        btnViewdata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewdataMouseClicked(evt);
            }
        });

        btnsistem.setForeground(new java.awt.Color(153, 0, 153));
        btnsistem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/system.png"))); // NOI18N
        btnsistem.setText("Sistem Pengeluaran");
        btnsistem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsistem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsistemMouseClicked(evt);
            }
        });

        btnpenyajian.setForeground(new java.awt.Color(153, 0, 153));
        btnpenyajian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/penyajian.png"))); // NOI18N
        btnpenyajian.setText("Penyajian Data");
        btnpenyajian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpenyajian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpenyajianMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInputdata)
                    .addComponent(btnsistem)
                    .addComponent(btnViewdata)
                    .addComponent(btnpenyajian))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnInputdata)
                .addGap(18, 18, 18)
                .addComponent(btnViewdata)
                .addGap(18, 18, 18)
                .addComponent(btnsistem)
                .addGap(18, 18, 18)
                .addComponent(btnpenyajian)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        add(menuPanel);

        mainPanel.setBackground(new java.awt.Color(22, 160, 133));
        mainPanel.setLayout(new java.awt.CardLayout());

        inputData.setBackground(new java.awt.Color(22, 160, 133));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("NAMA");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("INPUT DATA PENGHUNI");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("NO KAMAR");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("NO LANTAI");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("NOMINAL  Rp.");

        txtNama.setBackground(new java.awt.Color(22, 160, 133));
        txtNama.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtNama.setForeground(new java.awt.Color(153, 0, 153));
        txtNama.setBorder(null);
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        jComboBox1.setForeground(new java.awt.Color(153, 0, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jComboBox2.setForeground(new java.awt.Color(153, 0, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jTextField2.setBackground(new java.awt.Color(22, 160, 133));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 0, 153));
        jTextField2.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(153, 0, 153));

        jSeparator2.setBackground(new java.awt.Color(153, 0, 153));

        btnSimpan.setBackground(new java.awt.Color(0, 150, 136));
        btnSimpan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSimpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSimpanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSimpanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSimpanMouseReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("SIMPAN");

        javax.swing.GroupLayout btnSimpanLayout = new javax.swing.GroupLayout(btnSimpan);
        btnSimpan.setLayout(btnSimpanLayout);
        btnSimpanLayout.setHorizontalGroup(
            btnSimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSimpanLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(21, 21, 21))
        );
        btnSimpanLayout.setVerticalGroup(
            btnSimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSimpanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout inputDataLayout = new javax.swing.GroupLayout(inputData);
        inputData.setLayout(inputDataLayout);
        inputDataLayout.setHorizontalGroup(
            inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputDataLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputDataLayout.createSequentialGroup()
                        .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jSeparator1))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputDataLayout.createSequentialGroup()
                    .addContainerGap(196, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(167, 167, 167)))
        );
        inputDataLayout.setVerticalGroup(
            inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputDataLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inputDataLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel6)
                    .addContainerGap(421, Short.MAX_VALUE)))
        );

        mainPanel.add(inputData, "card2");

        viewData.setBackground(new java.awt.Color(22, 160, 133));

        btnBlnSkrng.setBackground(new java.awt.Color(0, 204, 204));
        btnBlnSkrng.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBlnSkrng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBlnSkrngMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Bulan Sekarang");

        javax.swing.GroupLayout btnBlnSkrngLayout = new javax.swing.GroupLayout(btnBlnSkrng);
        btnBlnSkrng.setLayout(btnBlnSkrngLayout);
        btnBlnSkrngLayout.setHorizontalGroup(
            btnBlnSkrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBlnSkrngLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
        );
        btnBlnSkrngLayout.setVerticalGroup(
            btnBlnSkrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBlnSkrngLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        btnBlnSblm.setBackground(new java.awt.Color(0, 204, 204));
        btnBlnSblm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBlnSblm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBlnSblmMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Bulan Sebelumnya");

        javax.swing.GroupLayout btnBlnSblmLayout = new javax.swing.GroupLayout(btnBlnSblm);
        btnBlnSblm.setLayout(btnBlnSblmLayout);
        btnBlnSblmLayout.setHorizontalGroup(
            btnBlnSblmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBlnSblmLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(75, 75, 75))
        );
        btnBlnSblmLayout.setVerticalGroup(
            btnBlnSblmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBlnSblmLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout viewDataLayout = new javax.swing.GroupLayout(viewData);
        viewData.setLayout(viewDataLayout);
        viewDataLayout.setHorizontalGroup(
            viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBlnSblm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBlnSkrng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        viewDataLayout.setVerticalGroup(
            viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnBlnSkrng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBlnSblm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        mainPanel.add(viewData, "card3");

        setPblnSblm.setBackground(new java.awt.Color(22, 160, 133));

        tabelBlnSblm.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelBlnSblm);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setText("PENGELUARAN BULAN SEBELUMNYA");

        javax.swing.GroupLayout setPblnSblmLayout = new javax.swing.GroupLayout(setPblnSblm);
        setPblnSblm.setLayout(setPblnSblmLayout);
        setPblnSblmLayout.setHorizontalGroup(
            setPblnSblmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setPblnSblmLayout.createSequentialGroup()
                .addGroup(setPblnSblmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setPblnSblmLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(setPblnSblmLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel12)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        setPblnSblmLayout.setVerticalGroup(
            setPblnSblmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setPblnSblmLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        mainPanel.add(setPblnSblm, "card5");

        setPblnSkrg.setBackground(new java.awt.Color(22, 160, 133));

        tabelBlnSkrng.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tabelBlnSkrng);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 153));
        jLabel16.setText("PENGELUARAN BULAN SEKARANG");

        javax.swing.GroupLayout setPblnSkrgLayout = new javax.swing.GroupLayout(setPblnSkrg);
        setPblnSkrg.setLayout(setPblnSkrgLayout);
        setPblnSkrgLayout.setHorizontalGroup(
            setPblnSkrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setPblnSkrgLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(142, 142, 142))
            .addGroup(setPblnSkrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setPblnSkrgLayout.createSequentialGroup()
                    .addContainerGap(41, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE)))
        );
        setPblnSkrgLayout.setVerticalGroup(
            setPblnSkrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setPblnSkrgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel16)
                .addContainerGap(433, Short.MAX_VALUE))
            .addGroup(setPblnSkrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setPblnSkrgLayout.createSequentialGroup()
                    .addContainerGap(104, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );

        mainPanel.add(setPblnSkrg, "card6");

        viewPengeluaran.setBackground(new java.awt.Color(22, 160, 133));

        tabelPengeluaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Nama Barang", "Nominal"
            }
        ));
        jScrollPane3.setViewportView(tabelPengeluaran);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 0, 153));
        jLabel20.setText("PENGELUARAN SAAT INI");

        javax.swing.GroupLayout viewPengeluaranLayout = new javax.swing.GroupLayout(viewPengeluaran);
        viewPengeluaran.setLayout(viewPengeluaranLayout);
        viewPengeluaranLayout.setHorizontalGroup(
            viewPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPengeluaranLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPengeluaranLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        viewPengeluaranLayout.setVerticalGroup(
            viewPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPengeluaranLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel20)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        mainPanel.add(viewPengeluaran, "card7");

        sistemPengeluaran.setBackground(new java.awt.Color(22, 160, 133));

        tabelSistemPeng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No ", "Nama Barang", "Nominal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelSistemPeng);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 153));
        jLabel19.setText("SISTEM PENGELUARAN");

        btnSimpanSetpeng.setBackground(new java.awt.Color(0, 150, 136));
        btnSimpanSetpeng.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 153));
        jLabel13.setText("Simpan");

        javax.swing.GroupLayout btnSimpanSetpengLayout = new javax.swing.GroupLayout(btnSimpanSetpeng);
        btnSimpanSetpeng.setLayout(btnSimpanSetpengLayout);
        btnSimpanSetpengLayout.setHorizontalGroup(
            btnSimpanSetpengLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSimpanSetpengLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel13)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        btnSimpanSetpengLayout.setVerticalGroup(
            btnSimpanSetpengLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSimpanSetpengLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 153));
        jLabel14.setText("Nama Barang");

        jTextField1.setBackground(new java.awt.Color(22, 160, 133));
        jTextField1.setForeground(new java.awt.Color(153, 0, 153));
        jTextField1.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 153));
        jLabel15.setText("Nominal");

        jTextField3.setBackground(new java.awt.Color(22, 160, 133));
        jTextField3.setForeground(new java.awt.Color(153, 0, 153));
        jTextField3.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(153, 0, 153));

        jSeparator4.setBackground(new java.awt.Color(153, 0, 153));

        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setText("Rp");

        jPanel1.setBackground(new java.awt.Color(0, 150, 136));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 153));
        jLabel17.setText("Edit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel17)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 150, 136));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 0, 153));
        jLabel18.setText("Hapus");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel18)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sistemPengeluaranLayout = new javax.swing.GroupLayout(sistemPengeluaran);
        sistemPengeluaran.setLayout(sistemPengeluaranLayout);
        sistemPengeluaranLayout.setHorizontalGroup(
            sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sistemPengeluaranLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sistemPengeluaranLayout.createSequentialGroup()
                        .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(sistemPengeluaranLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(68, 68, 68))
                            .addGroup(sistemPengeluaranLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)))
                        .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)))
                    .addComponent(btnSimpanSetpeng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(sistemPengeluaranLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sistemPengeluaranLayout.setVerticalGroup(
            sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sistemPengeluaranLayout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(29, 29, 29)
                .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sistemPengeluaranLayout.createSequentialGroup()
                        .addComponent(btnSimpanSetpeng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        mainPanel.add(sistemPengeluaran, "card8");

        penyajianData.setBackground(new java.awt.Color(22, 160, 133));

        jLabel4.setText("Klik DIsini untuk mengambil format data ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(29, 29, 29))
        );

        jLabel3.setText("Data Berbentuk format PDF");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout penyajianDataLayout = new javax.swing.GroupLayout(penyajianData);
        penyajianData.setLayout(penyajianDataLayout);
        penyajianDataLayout.setHorizontalGroup(
            penyajianDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penyajianDataLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(penyajianDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        penyajianDataLayout.setVerticalGroup(
            penyajianDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penyajianDataLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );

        mainPanel.add(penyajianData, "card9");

        add(mainPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputdataMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(inputData);
        mainPanel.repaint();
        mainPanel.revalidate();

    }//GEN-LAST:event_btnInputdataMouseClicked

    private void btnInputdataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputdataMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btnInputdataMouseEntered

    private void btnInputdataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputdataMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btnInputdataMouseExited

    private void btnViewdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewdataMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(viewData);
        mainPanel.repaint();
        mainPanel.revalidate();

    }//GEN-LAST:event_btnViewdataMouseClicked

    private void btnsistemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsistemMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(sistemPengeluaran);
        mainPanel.repaint();
        mainPanel.revalidate();

    }//GEN-LAST:event_btnsistemMouseClicked

    private void btnpenyajianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpenyajianMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(penyajianData);
        mainPanel.repaint();
        mainPanel.revalidate();

    }//GEN-LAST:event_btnpenyajianMouseClicked

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSimpanMouseClicked

    private void btnSimpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSimpanMouseEntered

    private void btnSimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSimpanMouseExited

    private void btnSimpanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSimpanMousePressed

    private void btnSimpanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSimpanMouseReleased

    private void btnBlnSkrngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBlnSkrngMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(setPblnSkrg);
        mainPanel.repaint();
        mainPanel.revalidate();

    }//GEN-LAST:event_btnBlnSkrngMouseClicked

    private void btnBlnSblmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBlnSblmMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(setPblnSblm);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnBlnSblmMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBlnSblm;
    private javax.swing.JPanel btnBlnSkrng;
    private javax.swing.JLabel btnInputdata;
    private javax.swing.JPanel btnSimpan;
    private javax.swing.JPanel btnSimpanSetpeng;
    private javax.swing.JLabel btnViewdata;
    private javax.swing.JLabel btnpenyajian;
    private javax.swing.JLabel btnsistem;
    private javax.swing.JPanel inputData;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel penyajianData;
    private javax.swing.JPanel setPblnSblm;
    private javax.swing.JPanel setPblnSkrg;
    private javax.swing.JPanel sistemPengeluaran;
    private javax.swing.JTable tabelBlnSblm;
    private javax.swing.JTable tabelBlnSkrng;
    private javax.swing.JTable tabelPengeluaran;
    private javax.swing.JTable tabelSistemPeng;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPanel viewData;
    private javax.swing.JPanel viewPengeluaran;
    // End of variables declaration//GEN-END:variables
}
