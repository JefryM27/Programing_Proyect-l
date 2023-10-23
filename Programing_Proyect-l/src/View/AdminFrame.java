package View;

import Controller.*;

/**
 *
 * @author jefry
 */
public class AdminFrame extends javax.swing.JFrame {

    private int entityId;
    CtrlProvince cp = new CtrlProvince();
    CtrlCanton cc = new CtrlCanton();
    CtrlDistrict cd = new CtrlDistrict();
    CtrlSprings springs = new CtrlSprings();
    CtrlSampling sampling = new CtrlSampling();
    CtrlUser user = new CtrlUser();
    CtrlMeasurement measure = new CtrlMeasurement();

    public AdminFrame(int entityId) {
        this.entityId = entityId;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        loadPlaces();
        loadTables();
        loadResources();
    }
//Method to load all Provinces, Cantons and districts of Springs and Samplings
    public void loadPlaces() {
        cp.loadProvince(cbxProvinceSprings);
        cp.loadProvince(cbxProvinceSampling);
        cc.loadCantonsByProvince(cbxProvinceSprings, cbxCantonSprings);
        cd.loadDistrictsByCanton(cbxCantonSprings, cbxDistrictSprings);
        cc.loadCantonsByProvince(cbxProvinceSampling, cbxCantonSampling);
        cd.loadDistrictsByCanton(cbxCantonSampling, cbxDistrictSampling);
    }
//Method to load sampling and springs according combobox province and entityId
    public void loadResources() {
        sampling.getIDProvince(cbxProvinceSampling);
        springs.getIDProvince(cbxProvinceSprings);
        this.sampling.loadSamplingForADM(cbxSamplingMeasure, this.entityId);
        this.springs.loadSpringsForADM(cbxSpringsMeasure, this.entityId);
    }
//Method to load all tables of administrator frame
    public void loadTables() {
        this.springs.loadDataSpringsForADM(tblSprings, this.entityId);
        this.sampling.loadDataSamplingSitesForADM(tblSamplingSite, this.entityId);
        this.user.loadDataUsersForADM(tblUser, this.entityId);
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
        btnUserSave = new javax.swing.JButton();
        btnUserDelete = new javax.swing.JButton();
        lblUserName1 = new javax.swing.JLabel();
        Springs = new javax.swing.JPanel();
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
        Muestreo = new javax.swing.JPanel();
        pnMainMeassureSite = new javax.swing.JPanel();
        pnMeassureSiteTable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSamplingSite = new javax.swing.JTable();
        pnInfoMeassureSite = new javax.swing.JPanel();
        btnEditSamplingSite = new javax.swing.JButton();
        txtSamplingName = new javax.swing.JTextField();
        btnSaveSamplingSite = new javax.swing.JButton();
        btnDeleteSamplingSite = new javax.swing.JButton();
        cbxProvinceSampling = new javax.swing.JComboBox<>();
        cbxCantonSampling = new javax.swing.JComboBox<>();
        lblMeassureSite1 = new javax.swing.JLabel();
        lblMeassureSite2 = new javax.swing.JLabel();
        lblMeassureSite3 = new javax.swing.JLabel();
        lblMeassureSite4 = new javax.swing.JLabel();
        cbxDistrictSampling = new javax.swing.JComboBox<>();
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

        btnUserSave.setText("Guardar");
        btnUserSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserSaveActionPerformed(evt);
            }
        });
        pnInfoUser.add(btnUserSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 121, 50));

        btnUserDelete.setText("Eliminar");
        btnUserDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserDeleteActionPerformed(evt);
            }
        });
        pnInfoUser.add(btnUserDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 121, 48));

        lblUserName1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName1.setText("Nombre: ");
        pnInfoUser.add(lblUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 25, -1, 28));

        User.add(pnInfoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 760, 240));

        jTabbedPane1.addTab("Registro Usuario", User);

        Springs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tblSprings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSpringsMouseClicked(evt);
            }
        });
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
        btnSpringsEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpringsEditActionPerformed(evt);
            }
        });

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
        btnSpringsSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpringsSaveActionPerformed(evt);
            }
        });

        btnSpringsDelete.setText("Eliminar");
        btnSpringsDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpringsDeleteActionPerformed(evt);
            }
        });

        cbxProvinceSprings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxProvinceSprings.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProvinceSpringsItemStateChanged(evt);
            }
        });
        cbxProvinceSprings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProvinceSpringsActionPerformed(evt);
            }
        });

        lblSpringsDescripsion1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpringsDescripsion1.setText("Provincia:");

        lblSpringsDescripsion2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpringsDescripsion2.setText("Canton:");

        cbxCantonSprings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCantonSprings.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCantonSpringsItemStateChanged(evt);
            }
        });
        cbxCantonSprings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCantonSpringsActionPerformed(evt);
            }
        });

        lblSpringsDescripsion3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpringsDescripsion3.setText("Distrito:");

        cbxDistrictSprings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxDistrictSprings.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxDistrictSpringsItemStateChanged(evt);
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
                                        .addComponent(cbxDistrictSprings, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(lblSpringsDescripsion3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(pnInfoSpringsLayout.createSequentialGroup()
                        .addComponent(btnSpringsSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnSpringsEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSpringsDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pnMainSprings.add(pnInfoSprings, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 760, 380));

        Springs.add(pnMainSprings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 680));

        jTabbedPane1.addTab("Registro Nacientes", Springs);

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

        Muestreo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMainMeassureSite.setBackground(new java.awt.Color(0, 152, 198));
        pnMainMeassureSite.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMeassureSiteTable.setBackground(new java.awt.Color(255, 255, 255));
        pnMeassureSiteTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tblSamplingSite.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSamplingSite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSamplingSiteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSamplingSite);

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

        btnEditSamplingSite.setText("Editar");
        btnEditSamplingSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSamplingSiteActionPerformed(evt);
            }
        });
        pnInfoMeassureSite.add(btnEditSamplingSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 120, 50));

        txtSamplingName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSamplingName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnInfoMeassureSite.add(txtSamplingName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 258, -1));

        btnSaveSamplingSite.setText("Guardar");
        btnSaveSamplingSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSamplingSiteActionPerformed(evt);
            }
        });
        pnInfoMeassureSite.add(btnSaveSamplingSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 121, 50));

        btnDeleteSamplingSite.setText("Eliminar");
        btnDeleteSamplingSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSamplingSiteActionPerformed(evt);
            }
        });
        pnInfoMeassureSite.add(btnDeleteSamplingSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 121, 48));

        cbxProvinceSampling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxProvinceSampling.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProvinceSamplingItemStateChanged(evt);
            }
        });
        cbxProvinceSampling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProvinceSamplingActionPerformed(evt);
            }
        });
        pnInfoMeassureSite.add(cbxProvinceSampling, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 260, -1));

        cbxCantonSampling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCantonSampling.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCantonSamplingItemStateChanged(evt);
            }
        });
        cbxCantonSampling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCantonSamplingActionPerformed(evt);
            }
        });
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

        cbxDistrictSampling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxDistrictSampling.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxDistrictSamplingItemStateChanged(evt);
            }
        });
        cbxDistrictSampling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDistrictSamplingActionPerformed(evt);
            }
        });
        pnInfoMeassureSite.add(cbxDistrictSampling, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 260, -1));

        pnMainMeassureSite.add(pnInfoMeassureSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 840, 340));

        Muestreo.add(pnMainMeassureSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1020, 650));

        jTabbedPane1.addTab("Registro Sitio de Muestreo", Muestreo);

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

    private void cbxDistrictSamplingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDistrictSamplingActionPerformed

    }//GEN-LAST:event_cbxDistrictSamplingActionPerformed

    private void cbxDistrictSamplingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxDistrictSamplingItemStateChanged
        sampling.getIdDistrict(cbxDistrictSampling);
    }//GEN-LAST:event_cbxDistrictSamplingItemStateChanged

    private void cbxCantonSamplingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCantonSamplingActionPerformed
        cd.loadDistrictsByCanton(cbxCantonSampling, cbxDistrictSampling);
    }//GEN-LAST:event_cbxCantonSamplingActionPerformed

    private void cbxCantonSamplingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCantonSamplingItemStateChanged
        sampling.getIDCanton(cbxCantonSampling);
    }//GEN-LAST:event_cbxCantonSamplingItemStateChanged

    private void cbxProvinceSamplingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProvinceSamplingActionPerformed
        cc.loadCantonsByProvince(cbxProvinceSampling, cbxCantonSampling);
        cd.loadDistrictsByCanton(cbxCantonSampling, cbxDistrictSampling);
    }//GEN-LAST:event_cbxProvinceSamplingActionPerformed

    private void cbxProvinceSamplingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProvinceSamplingItemStateChanged
        sampling.getIDProvince(cbxProvinceSampling);
    }//GEN-LAST:event_cbxProvinceSamplingItemStateChanged

    private void btnDeleteSamplingSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSamplingSiteActionPerformed
        sampling.deleteSamplingSite();
        loadTables();
    }//GEN-LAST:event_btnDeleteSamplingSiteActionPerformed

    private void btnSaveSamplingSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSamplingSiteActionPerformed
        sampling.addSamplingSiteForADM(txtSamplingName, cbxProvinceSampling, cbxCantonSampling, cbxDistrictSampling);
        loadTables();
    }//GEN-LAST:event_btnSaveSamplingSiteActionPerformed

    private void btnEditSamplingSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSamplingSiteActionPerformed
        sampling.updateSamplingSiteForADM(txtSamplingName, cbxProvinceSampling, cbxCantonSampling, cbxDistrictSampling);
        sampling.clearFields(txtSamplingName);
        loadTables();
    }//GEN-LAST:event_btnEditSamplingSiteActionPerformed

    private void tblSamplingSiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSamplingSiteMouseClicked
        sampling.selectedRow(tblSamplingSite, txtSamplingName, cbxProvinceSampling, cbxCantonSampling, cbxDistrictSampling, cbxMethod);
    }//GEN-LAST:event_tblSamplingSiteMouseClicked

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

    private void cbxDistrictSpringsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxDistrictSpringsItemStateChanged
        springs.getIdDistrict(cbxDistrictSprings);
    }//GEN-LAST:event_cbxDistrictSpringsItemStateChanged

    private void cbxCantonSpringsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCantonSpringsActionPerformed
        cd.loadDistrictsByCanton(cbxCantonSprings, cbxDistrictSprings);
    }//GEN-LAST:event_cbxCantonSpringsActionPerformed

    private void cbxCantonSpringsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCantonSpringsItemStateChanged
        springs.getIDCanton(cbxCantonSprings);
    }//GEN-LAST:event_cbxCantonSpringsItemStateChanged

    private void cbxProvinceSpringsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProvinceSpringsActionPerformed
        cc.loadCantonsByProvince(cbxProvinceSprings, cbxCantonSprings);
        cd.loadDistrictsByCanton(cbxCantonSprings, cbxDistrictSprings);
    }//GEN-LAST:event_cbxProvinceSpringsActionPerformed

    private void cbxProvinceSpringsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProvinceSpringsItemStateChanged
        springs.getIDProvince(cbxProvinceSprings);
    }//GEN-LAST:event_cbxProvinceSpringsItemStateChanged

    private void btnSpringsDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpringsDeleteActionPerformed
        springs.deleteWaterSprings();
        loadTables();
    }//GEN-LAST:event_btnSpringsDeleteActionPerformed

    private void btnSpringsSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpringsSaveActionPerformed
        springs.addWaterSpringForADM(txtSpringsName, txtSpringsAdress, txtSpringsLatitude, txtSpringsLenght, txtSpringsDescription);
        loadTables();
    }//GEN-LAST:event_btnSpringsSaveActionPerformed

    private void btnSpringsEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpringsEditActionPerformed
        springs.updateWaterSpringsForADM(txtSpringsName, txtSpringsAdress, txtSpringsLatitude, txtSpringsLenght, txtSpringsDescription);
        springs.clearFields(txtSpringsName, txtSpringsAdress, txtSpringsLatitude, txtSpringsLenght, txtSpringsDescription);
        loadTables();
    }//GEN-LAST:event_btnSpringsEditActionPerformed

    private void tblSpringsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSpringsMouseClicked
        springs.selectedRow(tblSprings, txtSpringsName, txtSpringsAdress, txtSpringsLatitude, txtSpringsLenght, txtSpringsDescription, cbxProvinceSprings, cbxCantonSprings, cbxDistrictSprings, cbxMethod);
    }//GEN-LAST:event_tblSpringsMouseClicked

    private void btnUserDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserDeleteActionPerformed
        user.deleteUser();
        user.clearFields(txtUserName, txtUserEmail, txtUserPassaword);
        loadTables();
    }//GEN-LAST:event_btnUserDeleteActionPerformed

    private void btnUserSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserSaveActionPerformed
        user.addUserForADM(txtUserName, txtUserEmail, txtUserPassaword);
        loadTables();
    }//GEN-LAST:event_btnUserSaveActionPerformed

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
    private javax.swing.JPanel Muestreo;
    private javax.swing.JPanel Springs;
    private javax.swing.JPanel User;
    private javax.swing.JButton btnDeleteSamplingSite;
    private javax.swing.JButton btnEditSamplingSite;
    private javax.swing.JButton btnFlowDelete;
    private javax.swing.JButton btnFlowEdit;
    private javax.swing.JButton btnFlowSave;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSaveSamplingSite;
    private javax.swing.JButton btnSpringsDelete;
    private javax.swing.JButton btnSpringsEdit;
    private javax.swing.JButton btnSpringsSave;
    private javax.swing.JButton btnUserDelete;
    private javax.swing.JButton btnUserEdit;
    private javax.swing.JButton btnUserSave;
    private javax.swing.JComboBox<String> cbxCantonSampling;
    private javax.swing.JComboBox<String> cbxCantonSprings;
    private javax.swing.JComboBox<String> cbxDistrictSampling;
    private javax.swing.JComboBox<String> cbxDistrictSprings;
    private javax.swing.JComboBox<String> cbxMethod;
    private javax.swing.JComboBox<String> cbxProvinceSampling;
    private javax.swing.JComboBox<String> cbxProvinceSprings;
    private javax.swing.JComboBox<String> cbxSamplingMeasure;
    private javax.swing.JComboBox<String> cbxSpringsMeasure;
    private javax.swing.JComboBox<String> cbxWeather;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEmailUser;
    private javax.swing.JLabel lblFlowDone;
    private javax.swing.JLabel lblFlowObservation;
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
    private javax.swing.JLabel lblSpringsLatitude;
    private javax.swing.JLabel lblSpringsLenght;
    private javax.swing.JLabel lblSpringsName;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JLabel lblUserName10;
    private javax.swing.JLabel lblUserName7;
    private javax.swing.JLabel lblUserName8;
    private javax.swing.JLabel lblUserName9;
    private javax.swing.JPanel pnCaudalTable;
    private javax.swing.JPanel pnInfoCaudal;
    private javax.swing.JPanel pnInfoMeassureSite;
    private javax.swing.JPanel pnInfoSprings;
    private javax.swing.JPanel pnInfoUser;
    private javax.swing.JPanel pnMainMeassureSite;
    private javax.swing.JPanel pnMainSprings;
    private javax.swing.JPanel pnMeassureSiteTable;
    private javax.swing.JPanel pnSpringsTable;
    private javax.swing.JPanel pnUserTable;
    private javax.swing.JTable tblFlowMeasure;
    private javax.swing.JTable tblSamplingSite;
    private javax.swing.JTable tblSprings;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtDoneBy;
    private javax.swing.JTextField txtFlowObservation;
    private javax.swing.JTextField txtSamplingName;
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
