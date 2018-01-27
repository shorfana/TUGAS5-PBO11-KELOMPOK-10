/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.view;

/**
 *
 * @author Shorfana
 */
public class InputDataView extends javax.swing.JPanel {

    /**
     * Creates new form InputDataView
     */
    public InputDataView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        btnInputdata = new javax.swing.JLabel();
        btnViewdata = new javax.swing.JLabel();
        btnsistem = new javax.swing.JLabel();
        btnpenyajian = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        setPblnSblm = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        setPblnSkrg = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        setPengeluaran = new javax.swing.JPanel();
        viewPengeluaran = new javax.swing.JPanel();
        sistemPengeluaran = new javax.swing.JPanel();
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

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pengelolauangkaskosan/icon/icon_app3.png"))); // NOI18N

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel11))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInputdata)
                            .addComponent(btnsistem)
                            .addComponent(btnViewdata)
                            .addComponent(btnpenyajian)
                            .addComponent(jLabel12))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(37, 37, 37)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInputdata)
                .addGap(18, 18, 18)
                .addComponent(btnViewdata)
                .addGap(18, 18, 18)
                .addComponent(btnsistem)
                .addGap(18, 18, 18)
                .addComponent(btnpenyajian)
                .addContainerGap(141, Short.MAX_VALUE))
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
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputDataLayout.createSequentialGroup()
                    .addContainerGap(174, Short.MAX_VALUE)
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
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inputDataLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel6)
                    .addContainerGap(511, Short.MAX_VALUE)))
        );

        mainPanel.add(inputData, "card2");

        viewData.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setText("Bulan Sekarang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel2.setText("Bulan Sebelumnya");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout viewDataLayout = new javax.swing.GroupLayout(viewData);
        viewData.setLayout(viewDataLayout);
        viewDataLayout.setHorizontalGroup(
            viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        viewDataLayout.setVerticalGroup(
            viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        mainPanel.add(viewData, "card3");

        setPblnSblm.setBackground(new java.awt.Color(22, 160, 133));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "No Kamar", "No Lantai", "Nominal"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout setPblnSblmLayout = new javax.swing.GroupLayout(setPblnSblm);
        setPblnSblm.setLayout(setPblnSblmLayout);
        setPblnSblmLayout.setHorizontalGroup(
            setPblnSblmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(setPblnSblmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(setPblnSblmLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );
        setPblnSblmLayout.setVerticalGroup(
            setPblnSblmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(setPblnSblmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(setPblnSblmLayout.createSequentialGroup()
                    .addGap(0, 81, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 82, Short.MAX_VALUE)))
        );

        mainPanel.add(setPblnSblm, "card5");

        setPblnSkrg.setBackground(new java.awt.Color(22, 160, 133));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "No Kamar", "No Lantai", "Nominal"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout setPblnSkrgLayout = new javax.swing.GroupLayout(setPblnSkrg);
        setPblnSkrg.setLayout(setPblnSkrgLayout);
        setPblnSkrgLayout.setHorizontalGroup(
            setPblnSkrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(setPblnSkrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(setPblnSkrgLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );
        setPblnSkrgLayout.setVerticalGroup(
            setPblnSkrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(setPblnSkrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(setPblnSkrgLayout.createSequentialGroup()
                    .addGap(0, 81, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 82, Short.MAX_VALUE)))
        );

        mainPanel.add(setPblnSkrg, "card6");

        setPengeluaran.setBackground(new java.awt.Color(22, 160, 133));

        javax.swing.GroupLayout setPengeluaranLayout = new javax.swing.GroupLayout(setPengeluaran);
        setPengeluaran.setLayout(setPengeluaranLayout);
        setPengeluaranLayout.setHorizontalGroup(
            setPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        setPengeluaranLayout.setVerticalGroup(
            setPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        mainPanel.add(setPengeluaran, "card6");

        viewPengeluaran.setBackground(new java.awt.Color(22, 160, 133));

        javax.swing.GroupLayout viewPengeluaranLayout = new javax.swing.GroupLayout(viewPengeluaran);
        viewPengeluaran.setLayout(viewPengeluaranLayout);
        viewPengeluaranLayout.setHorizontalGroup(
            viewPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        viewPengeluaranLayout.setVerticalGroup(
            viewPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        mainPanel.add(viewPengeluaran, "card7");

        sistemPengeluaran.setBackground(new java.awt.Color(22, 160, 133));

        javax.swing.GroupLayout sistemPengeluaranLayout = new javax.swing.GroupLayout(sistemPengeluaran);
        sistemPengeluaran.setLayout(sistemPengeluaranLayout);
        sistemPengeluaranLayout.setHorizontalGroup(
            sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        sistemPengeluaranLayout.setVerticalGroup(
            sistemPengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
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
                .addContainerGap(157, Short.MAX_VALUE))
        );
        penyajianDataLayout.setVerticalGroup(
            penyajianDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penyajianDataLayout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );

        mainPanel.add(penyajianData, "card9");

        add(mainPanel);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnpenyajianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpenyajianMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpenyajianMouseClicked

    private void btnsistemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsistemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsistemMouseClicked

    private void btnViewdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewdataMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnViewdataMouseClicked

    private void btnInputdataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputdataMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btnInputdataMouseExited

    private void btnInputdataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputdataMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btnInputdataMouseEntered

    private void btnInputdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputdataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInputdataMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnInputdata;
    private javax.swing.JPanel btnSimpan;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel penyajianData;
    private javax.swing.JPanel setPblnSblm;
    private javax.swing.JPanel setPblnSkrg;
    private javax.swing.JPanel setPengeluaran;
    private javax.swing.JPanel sistemPengeluaran;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPanel viewData;
    private javax.swing.JPanel viewPengeluaran;
    // End of variables declaration//GEN-END:variables
}
