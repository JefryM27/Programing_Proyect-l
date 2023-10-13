package View;

import Controller.CtrlProvince;

/**
 *
 * @author jefry
 */
public class Register extends javax.swing.JFrame {

    CtrlProvince cws = new CtrlProvince();

    public Register() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.provinces();
    }

    public void provinces() {
        this.cws.loadProvince(cbxProvinceSprings);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Entidades = new javax.swing.JPanel();
        pnMainSprings = new javax.swing.JPanel();
        pnSpringsTable = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSprings = new javax.swing.JTable();
        pnInfoSprings = new javax.swing.JPanel();
        btnSpringsEdit = new javax.swing.JButton();
        lblSpringsLenght = new javax.swing.JLabel();
        lblSpringAdress = new javax.swing.JLabel();
        lblSpringsName = new javax.swing.JLabel();
        lblSpringsLatitude = new javax.swing.JLabel();
        lblSpringsDescripsion = new javax.swing.JLabel();
        txtSpringsName = new javax.swing.JTextField();
        txtSpringsLatitude = new javax.swing.JTextField();
        txtSpringsAdress = new javax.swing.JTextField();
        txtSpringsLenght = new javax.swing.JTextField();
        txtSpringsDescription = new javax.swing.JTextField();
        btnSpringsSave = new javax.swing.JButton();
        btnSpringsDelete = new javax.swing.JButton();
        cbxProvinceSprings = new javax.swing.JComboBox<>();
        lblSpringsDescripsion1 = new javax.swing.JLabel();
        lblSpringsDescripsion2 = new javax.swing.JLabel();
        cbxCantonSprings = new javax.swing.JComboBox<>();
        lblSpringsDescripsion3 = new javax.swing.JLabel();
        cbxDistrictSprings = new javax.swing.JComboBox<>();
        lblSpringsDescripsion4 = new javax.swing.JLabel();
        cbxEntitySprings = new javax.swing.JComboBox<>();
        Nacientes = new javax.swing.JPanel();
        pnMainEntity = new javax.swing.JPanel();
        pnEntityTable = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblEntity = new javax.swing.JTable();
        pnInfoEntities = new javax.swing.JPanel();
        lblIdLegal = new javax.swing.JLabel();
        btnEntityEdit = new javax.swing.JButton();
        lblEntityAdress = new javax.swing.JLabel();
        lblEntityEmail = new javax.swing.JLabel();
        lblEntityName = new javax.swing.JLabel();
        lblEntityTelephoneNumber = new javax.swing.JLabel();
        lblEntityDescription = new javax.swing.JLabel();
        txtEntityName = new javax.swing.JTextField();
        txtEntityLegalId = new javax.swing.JTextField();
        txtEntityNumber = new javax.swing.JTextField();
        txtEntityEmail = new javax.swing.JTextField();
        txtEntityAdress = new javax.swing.JTextField();
        txtEntityDescription = new javax.swing.JTextField();
        btnEntitySave = new javax.swing.JButton();
        btnEntityDelete = new javax.swing.JButton();
        Muestreo = new javax.swing.JPanel();
        pnMainMeassureSite = new javax.swing.JPanel();
        pnMeassureSiteTable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        pnInfoMeassureSite = new javax.swing.JPanel();
        lblMeassureSite = new javax.swing.JLabel();
        btnMeassureEdit = new javax.swing.JButton();
        txtMeassureName = new javax.swing.JTextField();
        btnMeassureSave = new javax.swing.JButton();
        btnMeassureDelete = new javax.swing.JButton();
        cbxEntitySampling = new javax.swing.JComboBox<>();
        cbxProvinceSampling = new javax.swing.JComboBox<>();
        cbxCantonSampling = new javax.swing.JComboBox<>();
        lblMeassureSite1 = new javax.swing.JLabel();
        lblMeassureSite2 = new javax.swing.JLabel();
        lblMeassureSite3 = new javax.swing.JLabel();
        lblMeassureSite4 = new javax.swing.JLabel();
        cbxDistrictSampling1 = new javax.swing.JComboBox<>();
        pnMainMedition = new javax.swing.JPanel();
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
        tblFlowMeassure = new javax.swing.JTable();
        pnMainUser = new javax.swing.JPanel();
        pnUserTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        pnInfoUser = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        btnUserEdit = new javax.swing.JButton();
        lblPassaword = new javax.swing.JLabel();
        lblEmailUser = new javax.swing.JLabel();
        txtUserEmail = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtUserPassaword = new javax.swing.JTextField();
        btnUserSave = new javax.swing.JButton();
        btnUserDelete = new javax.swing.JButton();
        cbxRolUser = new javax.swing.JComboBox<>();
        lblUserName1 = new javax.swing.JLabel();
        lblUserName2 = new javax.swing.JLabel();
        cbxEntityUser1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        pnMainUser1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnUserSave1 = new javax.swing.JButton();
        btnUserEdit1 = new javax.swing.JButton();
        btnUserDelete1 = new javax.swing.JButton();
        btnGeneratePDF = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Entidades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMainSprings.setBackground(new java.awt.Color(0, 152, 198));
        pnMainSprings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnSpringsTable.setBackground(new java.awt.Color(255, 255, 255));
        pnSpringsTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tblSprings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Direccion", "Latitud", "Longitud", "Descipcion", "Provincia", "Canton", "Distrito", "Entidad"
            }
        ));
        jScrollPane5.setViewportView(tblSprings);

        javax.swing.GroupLayout pnSpringsTableLayout = new javax.swing.GroupLayout(pnSpringsTable);
        pnSpringsTable.setLayout(pnSpringsTableLayout);
        pnSpringsTableLayout.setHorizontalGroup(
            pnSpringsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSpringsTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        pnSpringsTableLayout.setVerticalGroup(
            pnSpringsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );

        pnMainSprings.add(pnSpringsTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 940, 240));

        pnInfoSprings.setBackground(new java.awt.Color(255, 255, 255));
        pnInfoSprings.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion de la Naciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        btnSpringsEdit.setText("Editar");

        lblSpringsLenght.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpringsLenght.setText("Longitud: ");

        lblSpringAdress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpringAdress.setText("Direccion: ");

        lblSpringsName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpringsName.setText("Nombre: ");

        lblSpringsLatitude.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpringsLatitude.setText("Latitud: ");

        lblSpringsDescripsion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpringsDescripsion.setText("Descripcion: ");

        txtSpringsName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSpringsName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSpringsLatitude.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSpringsLatitude.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSpringsAdress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSpringsAdress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSpringsLenght.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSpringsLenght.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSpringsDescription.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSpringsDescription.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSpringsSave.setText("Guardar");

        btnSpringsDelete.setText("Eliminar");

        cbxProvinceSprings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblSpringsDescripsion1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpringsDescripsion1.setText("Provincia:");

        lblSpringsDescripsion2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpringsDescripsion2.setText("Canton:");

        cbxCantonSprings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblSpringsDescripsion3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpringsDescripsion3.setText("Distrito:");

        cbxDistrictSprings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblSpringsDescripsion4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpringsDescripsion4.setText("Entidad:");

        cbxEntitySprings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxEntitySprings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEntitySpringsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnInfoSpringsLayout = new javax.swing.GroupLayout(pnInfoSprings);
        pnInfoSprings.setLayout(pnInfoSpringsLayout);
        pnInfoSpringsLayout.setHorizontalGroup(
            pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoSpringsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInfoSpringsLayout.createSequentialGroup()
                        .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnInfoSpringsLayout.createSequentialGroup()
                                .addComponent(lblSpringsName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSpringsName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnInfoSpringsLayout.createSequentialGroup()
                                .addComponent(lblSpringAdress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addComponent(txtSpringsAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnInfoSpringsLayout.createSequentialGroup()
                                .addComponent(lblSpringsLatitude)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSpringsLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInfoSpringsLayout.createSequentialGroup()
                                .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSpringsDescripsion)
                                    .addComponent(lblSpringsLenght)
                                    .addComponent(lblSpringsDescripsion1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbxProvinceSprings, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSpringsDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(cbxCantonSprings, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbxDistrictSprings, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbxEntitySprings, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtSpringsLenght, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)
                        .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnSpringsSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSpringsDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                            .addComponent(btnSpringsEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(171, 171, 171))
                    .addGroup(pnInfoSpringsLayout.createSequentialGroup()
                        .addComponent(lblSpringsDescripsion2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnInfoSpringsLayout.createSequentialGroup()
                        .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSpringsDescripsion3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSpringsDescripsion4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnInfoSpringsLayout.setVerticalGroup(
            pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoSpringsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInfoSpringsLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSpringsName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpringsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSpringAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpringsAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSpringsLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSpringsLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSpringsLenght, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpringsLenght, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSpringsDescripsion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpringsDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxProvinceSprings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSpringsDescripsion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSpringsDescripsion2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCantonSprings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSpringsDescripsion3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxDistrictSprings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnInfoSpringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSpringsDescripsion4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxEntitySprings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(pnInfoSpringsLayout.createSequentialGroup()
                        .addComponent(btnSpringsSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnSpringsEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSpringsDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pnMainSprings.add(pnInfoSprings, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 760, 380));

        Entidades.add(pnMainSprings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 680));

        jTabbedPane1.addTab("Registro Nacientes", Entidades);

        Nacientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMainEntity.setBackground(new java.awt.Color(0, 152, 198));
        pnMainEntity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnEntityTable.setBackground(new java.awt.Color(255, 255, 255));
        pnEntityTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tblEntity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cedula Juridica", "Nombre", "Email", "Telefono", "Direccion", "Descipcion"
            }
        ));
        jScrollPane4.setViewportView(tblEntity);

        javax.swing.GroupLayout pnEntityTableLayout = new javax.swing.GroupLayout(pnEntityTable);
        pnEntityTable.setLayout(pnEntityTableLayout);
        pnEntityTableLayout.setHorizontalGroup(
            pnEntityTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEntityTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE))
        );
        pnEntityTableLayout.setVerticalGroup(
            pnEntityTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );

        pnMainEntity.add(pnEntityTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 910, 240));

        pnInfoEntities.setBackground(new java.awt.Color(255, 255, 255));
        pnInfoEntities.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion de la Entidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lblIdLegal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblIdLegal.setText("Cedula Juridica: ");

        btnEntityEdit.setText("Editar");

        lblEntityAdress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEntityAdress.setText("Direccion: ");

        lblEntityEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEntityEmail.setText("Email: ");

        lblEntityName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEntityName.setText("Nombre: ");

        lblEntityTelephoneNumber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEntityTelephoneNumber.setText("Telefono: ");

        lblEntityDescription.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEntityDescription.setText("Descripcion: ");

        txtEntityName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEntityName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEntityLegalId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEntityLegalId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEntityNumber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEntityNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEntityEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEntityEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEntityAdress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEntityAdress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEntityDescription.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEntityDescription.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnEntitySave.setText("Guardar");

        btnEntityDelete.setText("Eliminar");

        javax.swing.GroupLayout pnInfoEntitiesLayout = new javax.swing.GroupLayout(pnInfoEntities);
        pnInfoEntities.setLayout(pnInfoEntitiesLayout);
        pnInfoEntitiesLayout.setHorizontalGroup(
            pnInfoEntitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoEntitiesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInfoEntitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnInfoEntitiesLayout.createSequentialGroup()
                        .addComponent(lblEntityName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEntityName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnInfoEntitiesLayout.createSequentialGroup()
                        .addComponent(lblEntityEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEntityEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnInfoEntitiesLayout.createSequentialGroup()
                        .addComponent(lblEntityTelephoneNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEntityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnInfoEntitiesLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(lblIdLegal)
                        .addGap(34, 34, 34)
                        .addComponent(txtEntityLegalId, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnInfoEntitiesLayout.createSequentialGroup()
                        .addComponent(lblEntityAdress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEntityAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnInfoEntitiesLayout.createSequentialGroup()
                        .addComponent(lblEntityDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEntityDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(pnInfoEntitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEntitySave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntityDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(btnEntityEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        pnInfoEntitiesLayout.setVerticalGroup(
            pnInfoEntitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoEntitiesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInfoEntitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInfoEntitiesLayout.createSequentialGroup()
                        .addGroup(pnInfoEntitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInfoEntitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEntityLegalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblIdLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEntitySave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnInfoEntitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEntityName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEntityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(pnInfoEntitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEntityEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEntityEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnInfoEntitiesLayout.createSequentialGroup()
                        .addComponent(btnEntityEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnEntityDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnInfoEntitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEntityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEntityTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnInfoEntitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEntityAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEntityAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnInfoEntitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEntityDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntityDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnMainEntity.add(pnInfoEntities, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 760, 330));

        Nacientes.add(pnMainEntity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        jTabbedPane1.addTab("Registro Entidades", Nacientes);

        Muestreo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMainMeassureSite.setBackground(new java.awt.Color(0, 152, 198));
        pnMainMeassureSite.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMeassureSiteTable.setBackground(new java.awt.Color(255, 255, 255));
        pnMeassureSiteTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre del Sitio", "Provincia", "Canton", "Distrito ", "Entidad"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout pnMeassureSiteTableLayout = new javax.swing.GroupLayout(pnMeassureSiteTable);
        pnMeassureSiteTable.setLayout(pnMeassureSiteTableLayout);
        pnMeassureSiteTableLayout.setHorizontalGroup(
            pnMeassureSiteTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMeassureSiteTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE))
        );
        pnMeassureSiteTableLayout.setVerticalGroup(
            pnMeassureSiteTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );

        pnMainMeassureSite.add(pnMeassureSiteTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 910, 240));

        pnInfoMeassureSite.setBackground(new java.awt.Color(255, 255, 255));
        pnInfoMeassureSite.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion de los sitios de muestreo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnInfoMeassureSite.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMeassureSite.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMeassureSite.setText("Entidad:");
        pnInfoMeassureSite.add(lblMeassureSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 28));

        btnMeassureEdit.setText("Editar");
        pnInfoMeassureSite.add(btnMeassureEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 120, 50));

        txtMeassureName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMeassureName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnInfoMeassureSite.add(txtMeassureName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 258, -1));

        btnMeassureSave.setText("Guardar");
        pnInfoMeassureSite.add(btnMeassureSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 121, 50));

        btnMeassureDelete.setText("Eliminar");
        pnInfoMeassureSite.add(btnMeassureDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 121, 48));

        cbxEntitySampling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnInfoMeassureSite.add(cbxEntitySampling, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 260, -1));

        cbxProvinceSampling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnInfoMeassureSite.add(cbxProvinceSampling, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 260, -1));

        cbxCantonSampling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnInfoMeassureSite.add(cbxCantonSampling, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 260, -1));

        lblMeassureSite1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMeassureSite1.setText("Ingrese el nombre del sitio de muestreo: ");
        pnInfoMeassureSite.add(lblMeassureSite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 290, 28));

        lblMeassureSite2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMeassureSite2.setText("Provincia:");
        pnInfoMeassureSite.add(lblMeassureSite2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, 28));

        lblMeassureSite3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMeassureSite3.setText("Canton:");
        pnInfoMeassureSite.add(lblMeassureSite3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 28));

        lblMeassureSite4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMeassureSite4.setText("Distrito:");
        pnInfoMeassureSite.add(lblMeassureSite4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, 28));

        cbxDistrictSampling1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnInfoMeassureSite.add(cbxDistrictSampling1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 260, -1));

        pnMainMeassureSite.add(pnInfoMeassureSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 840, 340));

        Muestreo.add(pnMainMeassureSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1020, 650));

        jTabbedPane1.addTab("Registro Sitio de Muestreo", Muestreo);

        pnMainMedition.setBackground(new java.awt.Color(0, 152, 192));
        pnMainMedition.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnInfoCaudal.setBackground(new java.awt.Color(255, 255, 255));
        pnInfoCaudal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion del Caudal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        btnFlowEdit.setText("Editar");

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

        btnFlowDelete.setText("Eliminar");

        cbxMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxWeather.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblUserName9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName9.setText("Sitio de Muestreo:");

        lblUserName10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName10.setText("Naciente:");

        cbxSpringsMeasure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxSamplingMeasure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        pnMainMedition.add(pnInfoCaudal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 810, 350));

        pnCaudalTable.setBackground(new java.awt.Color(255, 255, 255));
        pnCaudalTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tblFlowMeassure.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblFlowMeassure);

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

        pnMainMedition.add(pnCaudalTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 980, 240));

        jTabbedPane1.addTab("Registro de la Medicion del Caudal", pnMainMedition);

        pnMainUser.setBackground(new java.awt.Color(0, 152, 198));
        pnMainUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pnMainUser.add(pnUserTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 910, 200));

        pnInfoUser.setBackground(new java.awt.Color(255, 255, 255));
        pnInfoUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion del Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnInfoUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName.setText("Rol:");
        pnInfoUser.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, 28));

        btnUserEdit.setText("Editar");
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

        btnUserSave.setText("Guardar");
        pnInfoUser.add(btnUserSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 121, 50));

        btnUserDelete.setText("Eliminar");
        pnInfoUser.add(btnUserDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 121, 48));

        cbxRolUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnInfoUser.add(cbxRolUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 230, 30));

        lblUserName1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName1.setText("Nombre: ");
        pnInfoUser.add(lblUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 25, -1, 28));

        lblUserName2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName2.setText("Entidad:");
        pnInfoUser.add(lblUserName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, 28));

        cbxEntityUser1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnInfoUser.add(cbxEntityUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 230, 30));

        pnMainUser.add(pnInfoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 760, 240));

        jTabbedPane1.addTab("Registro Usuario", pnMainUser);

        pnMainUser1.setBackground(new java.awt.Color(0, 152, 198));
        pnMainUser1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generar Reportes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btnUserSave1.setText("Reporte de nacientes");
        btnUserSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserSave1ActionPerformed(evt);
            }
        });

        btnUserEdit1.setText("Reporte de medición de caudal");

        btnUserDelete1.setText("Reporte de todos los sitios de muestreo");
        btnUserDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserDelete1ActionPerformed(evt);
            }
        });

        btnGeneratePDF.setText("Generar PDF");
        btnGeneratePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneratePDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGeneratePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnUserSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnUserEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnUserDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnGeneratePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pnMainUser1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 470, 440));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(pnMainUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMainUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reportes", jPanel1);

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
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserDelete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserDelete1ActionPerformed

    private void btnUserSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserSave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserSave1ActionPerformed

    private void btnGeneratePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneratePDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGeneratePDFActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        dispose();
        login l = new login();
        l.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void cbxEntitySpringsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEntitySpringsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEntitySpringsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Entidades;
    private javax.swing.JPanel Muestreo;
    private javax.swing.JPanel Nacientes;
    private javax.swing.JButton btnEntityDelete;
    private javax.swing.JButton btnEntityEdit;
    private javax.swing.JButton btnEntitySave;
    private javax.swing.JButton btnFlowDelete;
    private javax.swing.JButton btnFlowEdit;
    private javax.swing.JButton btnFlowSave;
    private javax.swing.JButton btnGeneratePDF;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMeassureDelete;
    private javax.swing.JButton btnMeassureEdit;
    private javax.swing.JButton btnMeassureSave;
    private javax.swing.JButton btnSpringsDelete;
    private javax.swing.JButton btnSpringsEdit;
    private javax.swing.JButton btnSpringsSave;
    private javax.swing.JButton btnUserDelete;
    private javax.swing.JButton btnUserDelete1;
    private javax.swing.JButton btnUserEdit;
    private javax.swing.JButton btnUserEdit1;
    private javax.swing.JButton btnUserSave;
    private javax.swing.JButton btnUserSave1;
    private javax.swing.JComboBox<String> cbxCantonSampling;
    private javax.swing.JComboBox<String> cbxCantonSprings;
    private javax.swing.JComboBox<String> cbxDistrictSampling1;
    private javax.swing.JComboBox<String> cbxDistrictSprings;
    private javax.swing.JComboBox<String> cbxEntitySampling;
    public javax.swing.JComboBox<String> cbxEntitySprings;
    private javax.swing.JComboBox<String> cbxEntityUser1;
    private javax.swing.JComboBox<String> cbxMethod;
    private javax.swing.JComboBox<String> cbxProvinceSampling;
    private javax.swing.JComboBox<String> cbxProvinceSprings;
    private javax.swing.JComboBox<String> cbxRolUser;
    private javax.swing.JComboBox<String> cbxSamplingMeasure;
    private javax.swing.JComboBox<String> cbxSpringsMeasure;
    private javax.swing.JComboBox<String> cbxWeather;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblEmailUser;
    private javax.swing.JLabel lblEntityAdress;
    private javax.swing.JLabel lblEntityDescription;
    private javax.swing.JLabel lblEntityEmail;
    private javax.swing.JLabel lblEntityName;
    private javax.swing.JLabel lblEntityTelephoneNumber;
    private javax.swing.JLabel lblFlowDone;
    private javax.swing.JLabel lblFlowObservation;
    private javax.swing.JLabel lblIdLegal;
    private javax.swing.JLabel lblMeassureSite;
    private javax.swing.JLabel lblMeassureSite1;
    private javax.swing.JLabel lblMeassureSite2;
    private javax.swing.JLabel lblMeassureSite3;
    private javax.swing.JLabel lblMeassureSite4;
    private javax.swing.JLabel lblPassaword;
    private javax.swing.JLabel lblSpringAdress;
    private javax.swing.JLabel lblSpringsDescripsion;
    private javax.swing.JLabel lblSpringsDescripsion1;
    private javax.swing.JLabel lblSpringsDescripsion2;
    private javax.swing.JLabel lblSpringsDescripsion3;
    private javax.swing.JLabel lblSpringsDescripsion4;
    private javax.swing.JLabel lblSpringsLatitude;
    private javax.swing.JLabel lblSpringsLenght;
    private javax.swing.JLabel lblSpringsName;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JLabel lblUserName10;
    private javax.swing.JLabel lblUserName2;
    private javax.swing.JLabel lblUserName7;
    private javax.swing.JLabel lblUserName8;
    private javax.swing.JLabel lblUserName9;
    private javax.swing.JPanel pnCaudalTable;
    private javax.swing.JPanel pnEntityTable;
    private javax.swing.JPanel pnInfoCaudal;
    private javax.swing.JPanel pnInfoEntities;
    private javax.swing.JPanel pnInfoMeassureSite;
    private javax.swing.JPanel pnInfoSprings;
    private javax.swing.JPanel pnInfoUser;
    private javax.swing.JPanel pnMainEntity;
    private javax.swing.JPanel pnMainMeassureSite;
    private javax.swing.JPanel pnMainMedition;
    private javax.swing.JPanel pnMainSprings;
    private javax.swing.JPanel pnMainUser;
    private javax.swing.JPanel pnMainUser1;
    private javax.swing.JPanel pnMeassureSiteTable;
    private javax.swing.JPanel pnSpringsTable;
    private javax.swing.JPanel pnUserTable;
    private javax.swing.JTable tblEntity;
    private javax.swing.JTable tblFlowMeassure;
    private javax.swing.JTable tblSprings;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtDoneBy;
    private javax.swing.JTextField txtEntityAdress;
    private javax.swing.JTextField txtEntityDescription;
    private javax.swing.JTextField txtEntityEmail;
    private javax.swing.JTextField txtEntityLegalId;
    private javax.swing.JTextField txtEntityName;
    private javax.swing.JTextField txtEntityNumber;
    private javax.swing.JTextField txtFlowObservation;
    private javax.swing.JTextField txtMeassureName;
    private javax.swing.JTextField txtSpringsAdress;
    private javax.swing.JTextField txtSpringsDescription;
    private javax.swing.JTextField txtSpringsLatitude;
    private javax.swing.JTextField txtSpringsLenght;
    private javax.swing.JTextField txtSpringsName;
    private javax.swing.JTextField txtUserEmail;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserPassaword;
    // End of variables declaration//GEN-END:variables
}
