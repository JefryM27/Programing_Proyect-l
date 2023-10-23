package View;

import Controller.*;

/**
 *
 * @author jefry
 */
public class DigitadorFrame extends javax.swing.JFrame {

    private int entityId;
    private int digitizerId;
    CtrlSprings springs = new CtrlSprings();
    CtrlSampling sampling = new CtrlSampling();
    CtrlUser user = new CtrlUser();
    CtrlMeasurement measure = new CtrlMeasurement();

    public DigitadorFrame(int entityId, int digitizerId) {
        this.entityId = entityId;
        this.digitizerId = digitizerId;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.loadTables();
        this.loadResources();
    }
//Method to load sampling and springs according combobox SamplingMeasure and entityId
    public void loadResources() {
        this.sampling.loadSamplingForADM(cbxSamplingMeasure,this.entityId);
        this.springs.loadSpringsForADM(cbxSpringsMeasure, this.entityId);
    }
//Method to load all tables of digitizer frame
    public void loadTables() {
        this.user.loadDataDigitizer(tblUser, this.digitizerId);
        this.measure.loadDataMeasurementsForADM(tblFlowMeasure, this.entityId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        User = new javax.swing.JPanel();
        pnUserTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        pnInfoUser = new javax.swing.JPanel();
        btnUserEdit = new javax.swing.JButton();
        lblPassaword = new javax.swing.JLabel();
        lblEmailUser = new javax.swing.JLabel();
        txtUserEmail = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtUserPassaword = new javax.swing.JTextField();
        lblUserName1 = new javax.swing.JLabel();
        Medition = new javax.swing.JPanel();
        pnInfoCaudal = new javax.swing.JPanel();
        btnFlowEdit = new javax.swing.JButton();
        lblFlowObservation = new javax.swing.JLabel();
        lblUserName7 = new javax.swing.JLabel();
        lblUserName8 = new javax.swing.JLabel();
        lblFlowDone = new javax.swing.JLabel();
        txtFlowObservation = new javax.swing.JTextField();
        txtDoneBy = new javax.swing.JTextField();
        btnFlowSave = new javax.swing.JButton();
        btnFlowDelete = new javax.swing.JButton();
        cbxMethod = new javax.swing.JComboBox<>();
        cbxWeather = new javax.swing.JComboBox<>();
        lblUserName9 = new javax.swing.JLabel();
        lblUserName10 = new javax.swing.JLabel();
        cbxSpringsMeasure = new javax.swing.JComboBox<>();
        cbxSamplingMeasure = new javax.swing.JComboBox<>();
        pnCaudalTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFlowMeasure = new javax.swing.JTable();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        User.setBackground(new java.awt.Color(0, 152, 198));
        User.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnUserTable.setBackground(new java.awt.Color(255, 255, 255));
        pnUserTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Correo", "Contraseña", "Entidad", "Rol"
            }
        ));
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUser);

        javax.swing.GroupLayout pnUserTableLayout = new javax.swing.GroupLayout(pnUserTable);
        pnUserTable.setLayout(pnUserTableLayout);
        pnUserTableLayout.setHorizontalGroup(
            pnUserTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE))
        );
        pnUserTableLayout.setVerticalGroup(
            pnUserTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUserTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );

        User.add(pnUserTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 910, 200));

        pnInfoUser.setBackground(new java.awt.Color(255, 255, 255));
        pnInfoUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion del Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnInfoUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUserEdit.setText("Editar");
        btnUserEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserEditActionPerformed(evt);
            }
        });
        pnInfoUser.add(btnUserEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 120, 50));

        lblPassaword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPassaword.setText("Contraseña: ");
        pnInfoUser.add(lblPassaword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 28));

        lblEmailUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEmailUser.setText("Correo electonico: ");
        pnInfoUser.add(lblEmailUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 71, -1, 28));

        txtUserEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUserEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnInfoUser.add(txtUserEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 260, -1));

        txtUserName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnInfoUser.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 258, -1));

        txtUserPassaword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUserPassaword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnInfoUser.add(txtUserPassaword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 258, 26));

        lblUserName1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName1.setText("Nombre: ");
        pnInfoUser.add(lblUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 25, -1, 28));

        User.add(pnInfoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 760, 240));

        jTabbedPane1.addTab("Registro Usuario", User);

        Medition.setBackground(new java.awt.Color(0, 152, 192));
        Medition.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnInfoCaudal.setBackground(new java.awt.Color(255, 255, 255));
        pnInfoCaudal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion del Caudal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        btnFlowEdit.setText("Editar");
        btnFlowEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlowEditActionPerformed(evt);
            }
        });

        lblFlowObservation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFlowObservation.setText("Observacion: ");

        lblUserName7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName7.setText("Metodo: ");

        lblUserName8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName8.setText("Clima: ");

        lblFlowDone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFlowDone.setText("Realizado por: ");

        txtFlowObservation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFlowObservation.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDoneBy.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDoneBy.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnFlowSave.setText("Guardar");
        btnFlowSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlowSaveActionPerformed(evt);
            }
        });

        btnFlowDelete.setText("Eliminar");
        btnFlowDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlowDeleteActionPerformed(evt);
            }
        });

        cbxMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Directo", "Indirecto" }));

        cbxWeather.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soleado", "Nublado", "Lluvioso" }));

        lblUserName9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName9.setText("Sitio de Muestreo:");

        lblUserName10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName10.setText("Naciente:");

        cbxSpringsMeasure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxSpringsMeasure.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSpringsMeasureItemStateChanged(evt);
            }
        });
        cbxSpringsMeasure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSpringsMeasureActionPerformed(evt);
            }
        });

        cbxSamplingMeasure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxSamplingMeasure.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSamplingMeasureItemStateChanged(evt);
            }
        });
        cbxSamplingMeasure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSamplingMeasureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnInfoCaudalLayout = new javax.swing.GroupLayout(pnInfoCaudal);
        pnInfoCaudal.setLayout(pnInfoCaudalLayout);
        pnInfoCaudalLayout.setHorizontalGroup(
            pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoCaudalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInfoCaudalLayout.createSequentialGroup()
                        .addGroup(pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUserName9)
                            .addGroup(pnInfoCaudalLayout.createSequentialGroup()
                                .addComponent(lblFlowObservation)
                                .addGap(18, 18, 18)
                                .addComponent(txtFlowObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 92, Short.MAX_VALUE)
                                .addGroup(pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUserName8)
                                    .addComponent(lblUserName7)))
                            .addGroup(pnInfoCaudalLayout.createSequentialGroup()
                                .addComponent(lblFlowDone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDoneBy, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUserName10)))
                        .addGap(18, 18, 18))
                    .addGroup(pnInfoCaudalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFlowSave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnFlowEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)))
                .addGroup(pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxWeather, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSpringsMeasure, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSamplingMeasure, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFlowDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        pnInfoCaudalLayout.setVerticalGroup(
            pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoCaudalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFlowObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFlowObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxWeather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInfoCaudalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSpringsMeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnInfoCaudalLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFlowDone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoneBy, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSamplingMeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(pnInfoCaudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFlowSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFlowEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFlowDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Medition.add(pnInfoCaudal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 810, 350));

        pnCaudalTable.setBackground(new java.awt.Color(255, 255, 255));
        pnCaudalTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tblFlowMeasure.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Capacidad", "Metodo", "Observasion", "Fecha", "Clima", "Realizado por", "Naciente", "Sitio de Muestreo"
            }
        ));
        tblFlowMeasure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFlowMeasureMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFlowMeasure);

        javax.swing.GroupLayout pnCaudalTableLayout = new javax.swing.GroupLayout(pnCaudalTable);
        pnCaudalTable.setLayout(pnCaudalTableLayout);
        pnCaudalTableLayout.setHorizontalGroup(
            pnCaudalTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCaudalTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnCaudalTableLayout.setVerticalGroup(
            pnCaudalTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );

        Medition.add(pnCaudalTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 980, 240));

        jTabbedPane1.addTab("Registro de la Medicion del Caudal", Medition);

        btnLogout.setText("Cerrar Sesión");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        dispose();
        login l = new login();
        l.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void tblFlowMeasureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFlowMeasureMouseClicked
        measure.selectedRow(tblFlowMeasure, cbxMethod, txtFlowObservation, cbxWeather, txtDoneBy, cbxSpringsMeasure, cbxSamplingMeasure);
    }//GEN-LAST:event_tblFlowMeasureMouseClicked

    private void cbxSamplingMeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSamplingMeasureActionPerformed

    }//GEN-LAST:event_cbxSamplingMeasureActionPerformed

    private void cbxSamplingMeasureItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxSamplingMeasureItemStateChanged
        measure.getIdSampling(cbxSamplingMeasure);
    }//GEN-LAST:event_cbxSamplingMeasureItemStateChanged

    private void cbxSpringsMeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSpringsMeasureActionPerformed

    }//GEN-LAST:event_cbxSpringsMeasureActionPerformed

    private void cbxSpringsMeasureItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxSpringsMeasureItemStateChanged
        measure.getIDSprings(cbxSpringsMeasure);
    }//GEN-LAST:event_cbxSpringsMeasureItemStateChanged

    private void btnFlowDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlowDeleteActionPerformed
        measure.deleteFlowMeasurement();
        loadTables();
    }//GEN-LAST:event_btnFlowDeleteActionPerformed

    private void btnFlowSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlowSaveActionPerformed
        measure.addFlowMeasurement(cbxMethod, txtFlowObservation, cbxWeather, txtDoneBy);
        loadTables();
    }//GEN-LAST:event_btnFlowSaveActionPerformed

    private void btnFlowEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlowEditActionPerformed
        measure.updateFlowMeasurement(tblFlowMeasure,cbxMethod, txtFlowObservation, cbxWeather, txtDoneBy);
        measure.clearFields(txtFlowObservation, txtDoneBy);
        loadTables();
    }//GEN-LAST:event_btnFlowEditActionPerformed

    private void btnUserEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserEditActionPerformed
        user.updateUserForADM(tblUser, txtUserName, txtUserEmail, txtUserPassaword);
        user.clearFields(txtUserName, txtUserEmail, txtUserPassaword);
        loadTables();
    }//GEN-LAST:event_btnUserEditActionPerformed

    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        user.selectedRow(tblUser, txtUserName, txtUserEmail, txtUserPassaword, cbxMethod, cbxMethod);
    }//GEN-LAST:event_tblUserMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Medition;
    private javax.swing.JPanel User;
    private javax.swing.JButton btnFlowDelete;
    private javax.swing.JButton btnFlowEdit;
    private javax.swing.JButton btnFlowSave;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUserEdit;
    private javax.swing.JComboBox<String> cbxMethod;
    private javax.swing.JComboBox<String> cbxSamplingMeasure;
    private javax.swing.JComboBox<String> cbxSpringsMeasure;
    private javax.swing.JComboBox<String> cbxWeather;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEmailUser;
    private javax.swing.JLabel lblFlowDone;
    private javax.swing.JLabel lblFlowObservation;
    private javax.swing.JLabel lblPassaword;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JLabel lblUserName10;
    private javax.swing.JLabel lblUserName7;
    private javax.swing.JLabel lblUserName8;
    private javax.swing.JLabel lblUserName9;
    private javax.swing.JPanel pnCaudalTable;
    private javax.swing.JPanel pnInfoCaudal;
    private javax.swing.JPanel pnInfoUser;
    private javax.swing.JPanel pnUserTable;
    private javax.swing.JTable tblFlowMeasure;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtDoneBy;
    private javax.swing.JTextField txtFlowObservation;
    private javax.swing.JTextField txtUserEmail;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserPassaword;
    // End of variables declaration//GEN-END:variables

}
