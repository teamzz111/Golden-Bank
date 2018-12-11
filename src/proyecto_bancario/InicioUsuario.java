package proyecto_bancario;

import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InicioUsuario extends javax.swing.JFrame {

    public InicioUsuario() {
        initComponents();
        PSaldo.setVisible(false);        
        setLocationRelativeTo(null);
    }

    public String SaldoBTC = "";
    public int cuenta = 0;
    public String tipocuenta = "",l;
    public Object m;
    public String Saldo = "", DivisaF = "Peso colombiano", ResDolar = "0.000332", ResDolar2 = "6156";
    bGUI Primaria = new bGUI();

    public boolean Inicializar(String Nombre, String Apellido, String correo, String CC2) {
        try {
            this.setVisible(true);
            Saludo.setText("Bienvenido de nuevo, Sr(a). " + Nombre);
            OpsCuenta.removeAllItems();
            Primaria.con = Primaria.Conexion();
            String query = "SELECT cuenta.NoCuenta, cuenta.Saldo, cuenta.SaldoCripto, tipocuenta.Tipo FROM cuenta, tipocuenta WHERE cuenta.CedulaUsuario = " + CC2 + " AND cuenta.TipoCuenta = tipocuenta.Id;";
            Statement p = Primaria.con.createStatement();
            ResultSet t = p.executeQuery(query);
            int i = 0;
            while (t.next()) {
                if (i == 0) {
                    Saldo = t.getString(2);
                    cuenta = Integer.parseInt(t.getString(1));
                    SaldoBTC = t.getString(3);
                    tipocuenta = t.getString(4);
                    l=CC2;
                }
                OpsCuenta.addItem("Cuenta " + t.getString(1) + " -  Tipo " + t.getString(4));
                i++;
            }
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "El usuario " + CC2 + " no tiene asignada ninguna cuenta.", "Ha ocurrido una tragedia", JOptionPane.WARNING_MESSAGE);
               l=CC2;
            }
            Primaria.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PSaldo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        SaldoFiat = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        LetrasFiat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LetrasFiat1 = new javax.swing.JLabel();
        LetrasFiat2 = new javax.swing.JLabel();
        DivisaSelector = new javax.swing.JComboBox<>();
        CriptoNombr = new javax.swing.JLabel();
        PriceBTC = new javax.swing.JLabel();
        ValoBit = new javax.swing.JLabel();
        DivisaSelector1 = new javax.swing.JComboBox<>();
        TextoCantidad = new javax.swing.JTextField();
        CANTIDAD = new java.awt.Label();
        RETIRAR = new javax.swing.JButton();
        DivisaSelector2 = new javax.swing.JComboBox<>();
        SaldoFiat1 = new java.awt.Label();
        LetrasFiat3 = new javax.swing.JLabel();
        DivisaSelector3 = new javax.swing.JComboBox<>();
        LetrasFiat4 = new javax.swing.JLabel();
        ENVIAR = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        OpsCuenta = new javax.swing.JComboBox<>();
        Saludo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        HISTORIAL = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        CuentaP = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        RETIRAR2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GOLDEN BANK");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1260, 740));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PSaldo.setBackground(new java.awt.Color(0, 0, 51));
        PSaldo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        PSaldo.setForeground(new java.awt.Color(255, 255, 255));
        PSaldo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        PSaldo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("SALDO FIAT");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        PSaldo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        SaldoFiat.setAlignment(java.awt.Label.CENTER);
        SaldoFiat.setFont(new java.awt.Font("Arial", 0, 58)); // NOI18N
        SaldoFiat.setForeground(new java.awt.Color(255, 255, 255));
        SaldoFiat.setText("1'000,000");
        PSaldo.add(SaldoFiat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 590, 70));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("CRIPTOMONEDAS");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 70));

        PSaldo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 620, 70));

        LetrasFiat.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        LetrasFiat.setForeground(new java.awt.Color(255, 255, 255));
        LetrasFiat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasFiat.setText(".");
        PSaldo.add(LetrasFiat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 580, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("N° CUENTA A ENVIAR");
        PSaldo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        LetrasFiat1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        LetrasFiat1.setForeground(new java.awt.Color(255, 255, 255));
        LetrasFiat1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasFiat1.setText(".");
        PSaldo.add(LetrasFiat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 580, 50));

        LetrasFiat2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        LetrasFiat2.setForeground(new java.awt.Color(255, 255, 255));
        LetrasFiat2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasFiat2.setText(".");
        PSaldo.add(LetrasFiat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 580, 60));

        DivisaSelector.setBackground(new java.awt.Color(0, 0, 0));
        DivisaSelector.setForeground(new java.awt.Color(255, 255, 255));
        DivisaSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DivisaSelector.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DivisaSelectorItemStateChanged(evt);
            }
        });
        PSaldo.add(DivisaSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 170, -1));

        CriptoNombr.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        CriptoNombr.setForeground(new java.awt.Color(255, 255, 255));
        CriptoNombr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CriptoNombr.setText("BITCOIN ");
        PSaldo.add(CriptoNombr, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 600, 60));

        PriceBTC.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        PriceBTC.setForeground(new java.awt.Color(255, 255, 255));
        PriceBTC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PriceBTC.setText("0.0006 BTC");
        PSaldo.add(PriceBTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 600, 70));

        ValoBit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ValoBit.setForeground(new java.awt.Color(255, 255, 255));
        ValoBit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValoBit.setText("VALORIZACIÓN FIAT: 6156 USD");
        PSaldo.add(ValoBit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 610, -1));

        DivisaSelector1.setBackground(new java.awt.Color(0, 0, 0));
        DivisaSelector1.setForeground(new java.awt.Color(255, 255, 255));
        DivisaSelector1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DivisaSelector1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DivisaSelector1ItemStateChanged(evt);
            }
        });
        DivisaSelector1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisaSelector1ActionPerformed(evt);
            }
        });
        PSaldo.add(DivisaSelector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 80, 170, -1));

        TextoCantidad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TextoCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCantidadActionPerformed(evt);
            }
        });
        TextoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextoCantidadKeyTyped(evt);
            }
        });
        PSaldo.add(TextoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 530, 40));
        CANTIDAD.setVisible(false);
        RETIRAR.setVisible(false);
        RETIRAR.setEnabled(false);
        TextoCantidad.setVisible(false);

        CANTIDAD.setAlignment(java.awt.Label.CENTER);
        CANTIDAD.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        CANTIDAD.setForeground(new java.awt.Color(255, 255, 255));
        CANTIDAD.setText("CANTIDAD");
        PSaldo.add(CANTIDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 560, 60));

        RETIRAR.setBackground(new java.awt.Color(0, 0, 0));
        RETIRAR.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        RETIRAR.setForeground(new java.awt.Color(255, 255, 255));
        RETIRAR.setText("RETIRAR");
        RETIRAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RETIRAR.setContentAreaFilled(false);
        RETIRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RETIRARActionPerformed(evt);
            }
        });
        PSaldo.add(RETIRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 200, 40));

        DivisaSelector2.setBackground(new java.awt.Color(0, 0, 0));
        DivisaSelector2.setForeground(new java.awt.Color(255, 255, 255));
        DivisaSelector2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saldo Fiat", "Criptomoneda" }));
        DivisaSelector2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DivisaSelector2ItemStateChanged(evt);
            }
        });
        PSaldo.add(DivisaSelector2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, -1));
        DivisaSelector2.setVisible(false);

        SaldoFiat1.setAlignment(java.awt.Label.CENTER);
        SaldoFiat1.setFont(new java.awt.Font("Arial", 0, 58)); // NOI18N
        SaldoFiat1.setForeground(new java.awt.Color(255, 255, 255));
        SaldoFiat1.setText("1'000,000");
        PSaldo.add(SaldoFiat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 590, 70));
        SaldoFiat1.setVisible(false);
        SaldoFiat1.setText("0.0006 BTC");

        LetrasFiat3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        LetrasFiat3.setForeground(new java.awt.Color(255, 255, 255));
        LetrasFiat3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasFiat3.setText(".");
        PSaldo.add(LetrasFiat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 580, 70));
        LetrasFiat3.setVisible(false);
        LetrasFiat3.setText("VALORIZACIÓN FIAT: 6156 USD");

        DivisaSelector3.setBackground(new java.awt.Color(0, 0, 0));
        DivisaSelector3.setForeground(new java.awt.Color(255, 255, 255));
        DivisaSelector3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DivisaSelector3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DivisaSelector3ItemStateChanged(evt);
            }
        });
        PSaldo.add(DivisaSelector3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 170, -1));
        DivisaSelector3.setVisible(false);

        LetrasFiat4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        LetrasFiat4.setForeground(new java.awt.Color(255, 255, 255));
        LetrasFiat4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LetrasFiat4.setText(".");
        PSaldo.add(LetrasFiat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 580, 60));
        LetrasFiat4.setText("BITCOIN");

        ENVIAR.setBackground(new java.awt.Color(0, 0, 0));
        ENVIAR.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        ENVIAR.setForeground(new java.awt.Color(255, 255, 255));
        ENVIAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ENVIAR.setContentAreaFilled(false);
        ENVIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENVIARActionPerformed(evt);
            }
        });
        PSaldo.add(ENVIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 200, 40));
        ENVIAR.setVisible(false);
        ENVIAR.setEnabled(false);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        PSaldo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 360, -1));

        jPanel1.add(PSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1220, 360));
        HISTORIAL.setVisible(false);
        CuentaP.setVisible(false);

        OpsCuenta.setBackground(new java.awt.Color(0, 0, 0));
        OpsCuenta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OpsCuenta.setForeground(new java.awt.Color(255, 255, 255));
        OpsCuenta.setMaximumRowCount(10);
        OpsCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        OpsCuenta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OpsCuentaItemStateChanged(evt);
            }
        });
        OpsCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpsCuentaMouseClicked(evt);
            }
        });
        jPanel1.add(OpsCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 290, 40));

        Saludo.setFont(new java.awt.Font("Open Sans Light", 1, 24)); // NOI18N
        Saludo.setForeground(new java.awt.Color(255, 255, 255));
        Saludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Saludo.setText("Bienvenido de nuevo, Sr(a). Andrés Largo");
        jPanel1.add(Saludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 620, 60));

        jLabel15.setText("VERSIÓN: 0.1(b)");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 720, 150, 20));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 180));

        HISTORIAL.setBackground(new java.awt.Color(0, 0, 51));
        HISTORIAL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        HISTORIAL.setForeground(new java.awt.Color(255, 255, 255));
        HISTORIAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("HISTORIAL");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        HISTORIAL.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 70));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 51));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jTable2.setBackground(new java.awt.Color(0, 0, 51));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable2);

        HISTORIAL.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1180, 250));

        jPanel1.add(HISTORIAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1220, 360));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SALDO");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 100, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onsult.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 120, 100));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billete.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 120, 100));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RETIRAR DINERO");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 210, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ENVIAR DINERO");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 200, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("HISTORIAL");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 140, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CUENTA");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 150, 40));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CERRAR");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 150, 40));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cart-17.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 40, 110, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 130, 100));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inserte.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 130, 100));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 120, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1260, 150));

        CuentaP.setBackground(new java.awt.Color(0, 0, 51));
        CuentaP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CuentaP.setForeground(new java.awt.Color(255, 255, 255));
        CuentaP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("CUENTA");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 70));

        CuentaP.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 70));

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("100000000");
        CuentaP.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Señor Tocino");
        CuentaP.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 90, 290, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Digite su contraeña para realizar el cambio");
        CuentaP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 380, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de cuenta:");
        CuentaP.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de cuenta");
        CuentaP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Cédula:");
        CuentaP.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("1017109854");
        CuentaP.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Propietario(a):");
        CuentaP.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("N° Cuenta:");
        CuentaP.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Dirección:");
        CuentaP.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 30));

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Teléfono:");
        CuentaP.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, 30));

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Correo:");
        CuentaP.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 210, 30));

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Contraseña");
        CuentaP.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 210, 30));

        jTextField7.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        CuentaP.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 570, -1));

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        CuentaP.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 440, -1));

        jTextField3.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        CuentaP.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 440, -1));

        jTextField4.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        CuentaP.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 440, -1));

        jTextField5.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        CuentaP.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 440, -1));

        RETIRAR2.setBackground(new java.awt.Color(0, 0, 0));
        RETIRAR2.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        RETIRAR2.setForeground(new java.awt.Color(255, 255, 255));
        RETIRAR2.setText("ACTUALIZAR");
        RETIRAR2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RETIRAR2.setContentAreaFilled(false);
        RETIRAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RETIRAR2ActionPerformed(evt);
            }
        });
        CuentaP.add(RETIRAR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 200, 40));

        jPanel1.add(CuentaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1220, 360));

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1220, 360));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2dXyPG.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-480, 0, 1750, 1180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpsCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpsCuentaMouseClicked

    }//GEN-LAST:event_OpsCuentaMouseClicked

    private void OpsCuentaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_OpsCuentaItemStateChanged
        if (cuenta != 0) {
            String dat[];
            dat = evt.getItem().toString().split("-");
            if (!dat[0].equals("Cuenta " + cuenta + " ")) {
                try {
                    String aux = dat[0].substring(6).trim();
                    Primaria.con = Primaria.Conexion();
                    String query = "SELECT NoCuenta, Saldo, SaldoCripto FROM cuenta WHERE NoCuenta = " + aux;
                    Statement p = Primaria.con.createStatement();
                    ResultSet u = p.executeQuery(query);
                    while (u.next()) {
                        Saldo = u.getString(2);
                        cuenta = Integer.parseInt(u.getString(1));
                        SaldoBTC = u.getString(3);
                    }
                    Primaria.con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_OpsCuentaItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DivisaSelector.removeAllItems();
        DivisaSelector1.removeAllItems();
        DivisaSelector3.removeAllItems();
        DivisaSelector2.setSelectedItem("Saldo Fiat");
        jLabel17.setText("SALDO FIAT");
        SaldoFiat.setVisible(true);
        Letras(Saldo, "PESOS COLOMBIANOS", true, "Fiat", null);
        PSaldo.setVisible(true);
        PriceBTC.setText(SaldoBTC + " BTC");
        SaldoFiat1.setText(SaldoBTC + " BTC");
        
        DivisaSelector.setVisible(true);
        LetrasFiat.setVisible(true);
        LetrasFiat1.setVisible(true);
        LetrasFiat2.setVisible(true);
        
        CriptoNombr.setVisible(true);
        PriceBTC.setVisible(true);
        ValoBit.setVisible(true);
        CANTIDAD.setVisible(false);
        DivisaSelector2.setVisible(false);
        RETIRAR.setVisible(false);
        TextoCantidad.setVisible(false);
        RETIRAR.setEnabled(false);
        SaldoFiat1.setVisible(false);
        LetrasFiat3.setVisible(false);
        DivisaSelector3.setVisible(false);
        LetrasFiat4.setVisible(false);
        ENVIAR.setVisible(false);
        ENVIAR.setEnabled(false);
        jLabel1.setVisible(false);
        jTextField1.setVisible(false);
        DivisaSelector1.setVisible(true);
        jLabel18.setText("CRIPTOMONEDAS");
    }//GEN-LAST:event_jButton1ActionPerformed


    private void DivisaSelectorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DivisaSelectorItemStateChanged
        if (PSaldo.isVisible()) {
            try {

                Primaria.con = Primaria.Conexion();
                String query = "SELECT ValorResDolar FROM divisa WHERE Nombre = '" + evt.getItem() + "'";
                Statement p = Primaria.con.createStatement();
                ResultSet u = p.executeQuery(query);
                while (u.next()) {
                    Letras("" + (Double.parseDouble(Saldo) * Double.parseDouble(ResDolar)) / Double.parseDouble(u.getString(1)), evt.getItem().toString().toUpperCase(), false, "Fiat", null);
                    System.out.println((Double.parseDouble(Saldo) * Double.parseDouble(ResDolar)) / Double.parseDouble(u.getString(1)));
                }
                Primaria.con.close();
            } catch (SQLException ex) {
                Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DivisaSelectorItemStateChanged

    private void DivisaSelector1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DivisaSelector1ItemStateChanged
        if (PSaldo.isVisible()) {
            try {
                Primaria.con = Primaria.Conexion();
                String query = "SELECT ValorResDolar FROM divisa WHERE Nombre = '" + evt.getItem() + "'";
                Statement p = Primaria.con.createStatement();
                ResultSet u = p.executeQuery(query);
                while (u.next()) {
                    Letras("" + (Double.parseDouble(SaldoBTC) * Double.parseDouble(ResDolar2)) / Double.parseDouble(u.getString(1)), evt.getItem().toString().toUpperCase(), false, "Cripto", u.getString(1));

                }
                Primaria.con.close();
            } catch (SQLException ex) {
                Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DivisaSelector1ItemStateChanged

    private void DivisaSelector1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisaSelector1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DivisaSelector1ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
      
        jButton1.doClick(); 
        CriptoNombr.setVisible(false);
        PriceBTC.setVisible(false);
        ValoBit.setVisible(false);
        CANTIDAD.setVisible(true);
        DivisaSelector1.setVisible(false);        
        jLabel18.setText("RETIRAR DINERO");
        TextoCantidad.setVisible(true);
        RETIRAR.setVisible(true);
        RETIRAR.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TextoCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoCantidadKeyTyped
        char c = evt.getKeyChar();
        String g=TextoCantidad.getText();
        if(c<'0' || c>'9')
        evt.consume();
    }//GEN-LAST:event_TextoCantidadKeyTyped

    private void RETIRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RETIRARActionPerformed

        if(TextoCantidad.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad", "Campo vacío", JOptionPane.WARNING_MESSAGE);
        else if(Integer.parseInt(TextoCantidad.getText())>Integer.parseInt(SaldoFiat.getText().replace(".", "")))
            JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad menor o igual al saldo que tiene", "Incoherencia", JOptionPane.WARNING_MESSAGE);
        else{
             try { 
                 
                  int b=0,Divisa=0, r;
                 
                Primaria.con = Primaria.Conexion();
               //String query = "update cuenta set Saldo=2000 where CedulaUsuario="+l;
               String query = "SELECT ValorResDolar, Id FROM divisa WHERE Nombre = '" + DivisaSelector.getSelectedItem() + "'";
                Statement k = Primaria.con.createStatement();
                ResultSet u = k.executeQuery(query);
               
                 while (u.next()) {
                    Divisa=u.getInt(2);
                    r=Integer.parseInt(SaldoFiat.getText().replace(".", ""))-Integer.parseInt(TextoCantidad.getText());
                   Saldo=String.valueOf((r*u.getDouble(1))/0.000332);//Transforma la cantidad que se tiene a pesos colombianos
                   Letras("" + (Double.parseDouble(Saldo) * Double.parseDouble(ResDolar)) / Double.parseDouble(u.getString(1)), DivisaSelector.getSelectedItem().toString().toUpperCase(), false, "Fiat", null);
                }
                 
               PreparedStatement p = Primaria.con.prepareStatement("UPDATE cuenta SET Saldo="+Saldo+" WHERE CedulaUsuario="+l);
                p.executeUpdate();
                
               
                

                String querys = "SELECT IdTransaccionCu FROM transaccioncuenta ORDER BY IdTransaccionCu DESC LIMIT 1";
                Statement j = Primaria.con.createStatement();
                ResultSet m = j.executeQuery(querys);
                while(m.next())
                b= Integer.parseInt(m.getString(1))+1;
                
                
               PreparedStatement h = Primaria.con.prepareStatement("INSERT INTO transaccioncuenta VALUES(?,?,?,?,?,?)");
                h.setInt(1, b);
                h.setString(2, "Retiro");
                h.setInt(3,Integer.parseInt(TextoCantidad.getText()));
                h.setString(4, fechaActual());
                h.setInt(5,Divisa);
                h.setInt(6, cuenta);
                h.executeUpdate();
                TextoCantidad.setText("");
                Primaria.con.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }  
            
        }   
    }//GEN-LAST:event_RETIRARActionPerformed

    private void DivisaSelector2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DivisaSelector2ItemStateChanged
        if (DivisaSelector2.getSelectedItem().equals("Criptomoneda")) {
            LetrasFiat3.setVisible(true);
            SaldoFiat1.setVisible(true);
            DivisaSelector3.setVisible(true);
            LetrasFiat4.setVisible(true);
            jLabel17.setText("CRIPTOMONEDA");
            
            DivisaSelector.setVisible(false);
            SaldoFiat.setVisible(false);
            LetrasFiat.setVisible(false);
            LetrasFiat1.setVisible(false);
            LetrasFiat2.setVisible(false);
            
        }
        else
            jButton4.doClick();
    }//GEN-LAST:event_DivisaSelector2ItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     
       jButton1.doClick();
       CriptoNombr.setVisible(false);
       PriceBTC.setVisible(false);
       ValoBit.setVisible(false);
       DivisaSelector1.setVisible(false);
       jLabel18.setText("ENVIAR DINERO");
       DivisaSelector2.setVisible(true);
       CANTIDAD.setText("CANTIDAD");
       TextoCantidad.setVisible(true);
       jLabel1.setVisible(true);
       jTextField1.setVisible(true);
       CANTIDAD.setVisible(true);
       ENVIAR.setVisible(true);
       ENVIAR.setEnabled(true);
       ENVIAR.setText("ENVIAR");
       LetrasFiat3.setVisible(false);
       SaldoFiat1.setVisible(false);
       DivisaSelector3.setVisible(false);
       LetrasFiat4.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void DivisaSelector3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DivisaSelector3ItemStateChanged
       if (PSaldo.isVisible()) {
            try {
                Primaria.con = Primaria.Conexion();
                String query = "SELECT ValorResDolar FROM divisa WHERE Nombre = '" + evt.getItem() + "'";
                Statement p = Primaria.con.createStatement();
                ResultSet u = p.executeQuery(query);
                while (u.next()) {
                    Letras("" + (Double.parseDouble(SaldoBTC) * Double.parseDouble(ResDolar2)) / Double.parseDouble(u.getString(1)), evt.getItem().toString().toUpperCase(), false, "Cripto", u.getString(1));

                }
                Primaria.con.close();
            } catch (SQLException ex) {
                Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DivisaSelector3ItemStateChanged

    
    private void ENVIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENVIARActionPerformed
       int kionda=0; 
        if(TextoCantidad.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            kionda=1;
        }
        else if(jTextField1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número de cuenta", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            kionda=1;
        }
        else if (DivisaSelector2.getSelectedItem().equals("Saldo Fiat"))
        {
            if(Integer.parseInt(TextoCantidad.getText())>Integer.parseInt(SaldoFiat.getText().replace(".", "")))
            {
                JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad menor o igual al saldo que tiene", "Incoherencia", JOptionPane.WARNING_MESSAGE);
                kionda=1;
            }
            
        }
        else if(DivisaSelector2.getSelectedItem().equals("Criptomoneda"))
            if(Integer.parseInt(TextoCantidad.getText())>Integer.parseInt(SaldoFiat1.getText().replace(" BTC", "").replace(".", "")))
            {
                JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad menor o igual al saldo que tiene", "Incoherencia", JOptionPane.WARNING_MESSAGE);
                kionda=1;
            }
        if (kionda==0)
        {
            try {

                int y=0, m=0, Divisa=0, g=0, z=0;
                Primaria.con = Primaria.Conexion();
                String query = "SELECT Saldo, SaldoCripto FROM cuenta where NoCuenta="+ jTextField1.getText();
                Statement p = Primaria.con.createStatement();
                ResultSet u = p.executeQuery(query);
                while (u.next()) 
                   y++;
                if(y==0)
                    JOptionPane.showMessageDialog(null, "El número de cuenta digitado no existe", "Que sad", JOptionPane.WARNING_MESSAGE);
                else
                {
                    
                    
                    while(u.next()) 
                    {
                        m=u.getInt(1);
                        z=u.getInt(2);
                    } //Obtener saldo de a quien se le envía el dinero
                    
                     String algo = "SELECT IdTransaccionCu FROM transaccioncuenta ORDER BY IdTransaccionCu DESC LIMIT 1";
                    Statement e = Primaria.con.createStatement();
                    ResultSet f = e.executeQuery(algo);
                    while(f.next())
                    g= Integer.parseInt(f.getString(1))+1;
                    
                    int r;
                    double r1=0;
                   if(DivisaSelector.isVisible())
                    {
                        
                        String querys = "SELECT ValorResDolar, Id FROM divisa WHERE Nombre = '" + DivisaSelector.getSelectedItem() + "'";
                        Statement d = Primaria.con.createStatement();
                        ResultSet v = d.executeQuery(querys);
                        while (v.next()) {
                        Divisa=v.getInt(2);
                        r=(Integer.parseInt(SaldoFiat.getText().replace(".", "")))-(Integer.parseInt(TextoCantidad.getText()));
                        
                        r1=((Double.parseDouble(TextoCantidad.getText()))*(v.getDouble(1)))/0.000332;
                        Saldo=String.valueOf((r*v.getDouble(1))/0.000332);
                            Letras("" + (Double.parseDouble(Saldo) * Double.parseDouble(ResDolar)) / Double.parseDouble(v.getString(1)), DivisaSelector.getSelectedItem().toString().toUpperCase(), false, "Fiat", null);
                        }
                        PreparedStatement a = Primaria.con.prepareStatement("UPDATE cuenta SET Saldo="+Saldo+" WHERE CedulaUsuario="+l); //Quitar el saldo al usuario que envía
                        a.executeUpdate();
                        
                        PreparedStatement b = Primaria.con.prepareStatement("UPDATE cuenta SET Saldo="+(m+r1)+" WHERE NoCuenta="+jTextField1.getText()); //Agregar el saldo al usuario que recib
                        b.executeUpdate();
                    }//Para actualizar en pantalla el saldo del usuario en fiat
                    else
                    {
                        
                        String querys = "SELECT ValorResDolar, Id FROM divisa WHERE Nombre = '" + DivisaSelector3.getSelectedItem() + "'";
                        Statement d = Primaria.con.createStatement();
                        ResultSet v = d.executeQuery(querys);
                        while (v.next()) {
                            Divisa=v.getInt(2);
                            r=Integer.parseInt(SaldoFiat1.getText().replace(" BTC","").replace(".", ""))-Integer.parseInt(TextoCantidad.getText());
                            
                            r1=((Double.parseDouble(TextoCantidad.getText()))*(v.getDouble(1)))/6156;
                            SaldoBTC=String.valueOf((r*v.getDouble(1))/6156);
                            //Letras("" + Math.round(Double.parseDouble(SaldoBTC) * Double.parseDouble(ResDolar)) / Double.parseDouble(v.getString(1)), DivisaSelector3.getSelectedItem().toString().toUpperCase(), false, "Cripto",ResDolar);
                            SaldoFiat1.setText(String.valueOf(r));
                        }
                         PreparedStatement a = Primaria.con.prepareStatement("UPDATE cuenta SET SaldoCripto="+SaldoBTC+" WHERE CedulaUsuario="+l); //Quitar el saldo al usuario que envía
                        a.executeUpdate();
                        
                        PreparedStatement b = Primaria.con.prepareStatement("UPDATE cuenta SET Saldo="+(z+r1)+" WHERE NoCuenta="+jTextField1.getText()); //Agregar el saldo al usuario que recib
                        b.executeUpdate();
                    }//Para actualizar en pantalla el saldo del usuario en criptomonedas
                   
                   
                    
                    PreparedStatement c = Primaria.con.prepareStatement("INSERT INTO transaccioncuenta VALUES(?,?,?,?,?,?)");
                    c.setInt(1, g);
                    c.setString(2, "Ingreso");
                    c.setString(3, TextoCantidad.getText());
                    c.setString(4, fechaActual());
                    c.setInt(5, Divisa);
                    c.setString(6, jTextField1.getText());
                    c.executeUpdate(); //Toda esta wea para hacer la transacción de cuenta donde se le mete a la cuenta del receptor
                
                    PreparedStatement d = Primaria.con.prepareStatement("INSERT INTO transaccioncuenta VALUES(?,?,?,?,?,?)");
                    d.setInt(1, g+1);
                    d.setString(2, "Retiro");
                    d.setString(3, TextoCantidad.getText());
                    d.setString(4, fechaActual());
                    d.setInt(5, Divisa);
                    d.setInt(6, cuenta);
                    d.executeUpdate();
                    
                    jTextField1.setText("");
                    TextoCantidad.setText("");
                    
                }                
                Primaria.con.close();
            } catch (SQLException ex) {
                Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ENVIARActionPerformed

    private void TextoCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCantidadActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
         char c = evt.getKeyChar();
        String g=TextoCantidad.getText();
        if(c<'0' || c>'9')
        evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped
    public void FillTable(JTable table, String Query)
{
    try
    {
        Primaria.con = Primaria.Conexion();
        Statement stat = Primaria.con.createStatement();
        ResultSet rs = stat.executeQuery(Query);

        //To remove previously added rows
        while(table.getRowCount() > 0) 
        {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        int columns = rs.getMetaData().getColumnCount();
        while(rs.next())
        {  
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i);
            }
            ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1,row);
        }

        rs.close();
        stat.close();
        Primaria.con.close();
    }
    catch(SQLException e)
    {
    }
}                                         

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton1.doClick();
        PSaldo.setVisible(false);
        jPanel5.setVisible(false);
        HISTORIAL.setVisible(true);
        
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Id Transacción","Tipo de transacción","Monto","Fecha","Divisa"});
         try {
             
                    Primaria.con = Primaria.Conexion();
                    String query = "SELECT c.IdTransaccionCu, c.Tipo, c.Monto,c.Fecha,d.Nombre FROM transaccioncuenta as c, Divisa as d WHERE NoCuenta="+cuenta+" AND d.Id=c.Divisa";
                    Statement p = Primaria.con.createStatement();
                    ResultSet u = p.executeQuery(query);
                    while (u.next()) {
                        modelo.addRow(new Object[]{u.getString(1),u.getString(2),u.getString(3),u.getString(4),u.getString(5)});
                    }
                    jTable2.setModel(modelo);
                    Primaria.con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jButton1.doClick();
        PSaldo.setVisible(false);
        HISTORIAL.setVisible(false);
        CuentaP.setVisible(true);
        
        try {
             
            System.out.print(cuenta);
                    Primaria.con = Primaria.Conexion();
                    String query = "SELECT c.NoCuenta, t.Tipo, c.CedulaUsuario, u.Nombres, u.Direccion, u.Telefono, u.Correo, u.Contrasena FROM Cuenta as c, tipocuenta as t, usuario as u WHERE c.CedulaUsuario=u.Cedula AND c.TipoCuenta=t.Id AND NoCuenta="+cuenta;
                    Statement p = Primaria.con.createStatement();
                    ResultSet u = p.executeQuery(query);
                    while (u.next()) {
                        jLabel30.setText(u.getString(1));
                        jLabel5.setText(u.getString(2));
                        jLabel33.setText(u.getString(3));
                        jLabel31.setText(u.getString(4));
                        //jTextField1.setText(u.getString(8));
                        jTextField2.setText(u.getString(5));
                        jTextField3.setText(u.getString(6));
                        jTextField4.setText(u.getString(7));
                        //jTextField5.setText(u.getString(8));
                                
                    }
                    Primaria.con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void RETIRAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RETIRAR2ActionPerformed

        if(jTextField7.getText().isEmpty() || jTextField2.getText().isEmpty() ||jTextField3.getText().isEmpty() ||jTextField4.getText().isEmpty() ||jTextField5.getText().isEmpty())
               JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Campo vacío", JOptionPane.WARNING_MESSAGE);
        else{
             try {
            
                    Primaria.con = Primaria.Conexion();
                    
                    String Direccion=jTextField2.getText(), Telefono=jTextField3.getText(), Correo=jTextField4.getText(), Contraseña=jTextField5.getText();
                    
                    String query = "SELECT NoCuenta,Contrasena FROM Cuenta WHERE NoCuenta="+cuenta;
                    Statement p = Primaria.con.createStatement();
                    ResultSet u = p.executeQuery(query);
                    while (u.next()) {
                        System.out.print(u.getString(2));
                        if (!jTextField7.getText().equals(u.getString(2)))
                             JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
                        else
                        {
                          
                            PreparedStatement a = Primaria.con.prepareStatement("UPDATE usuario as u, cuenta as c SET u.direccion=\""+jTextField2.getText()+"\", u.Telefono="
                                    +Long.parseLong(jTextField3.getText())+",u.Correo=\""+jTextField4.getText()+"\",c.Contrasena="+Integer.parseInt(jTextField5.getText())+" WHERE c.CedulaUsuario="+l+" and u.Cedula=c.CedulaUsuario;");
                            a.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Sus datos han sido actualizados", "Operación Existoda", JOptionPane.INFORMATION_MESSAGE);
                            jTextField7.setText("");
                        }     
                    }
                    Primaria.con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
        } 
       
         
    }//GEN-LAST:event_RETIRAR2ActionPerformed

    public static String fechaActual(){
    
    Date fecha=new Date();
    DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");        
    return hourdateFormat.format(fecha);    
    
    
}
    public void Letras(String Saldoo, String Divisa, boolean pt, String tipo, String res) {
        if (tipo.equals("Fiat")) {
            int p = (int) Double.parseDouble(Saldoo);
            SaldoFiat.setText(Convert("" + (int) (Double.parseDouble(Saldoo))));
            Conversor o = new Conversor();
            String aux;
            aux = o.Ingresa(p + "").toUpperCase();
            if (aux.length() >= 60) {
                Font fuente = new Font("Arial", Font.BOLD, 14);
                LetrasFiat.setFont(fuente);
                LetrasFiat1.setFont(fuente);
                LetrasFiat2.setFont(fuente);
                LetrasFiat.setText(aux.substring(0, 60));
                LetrasFiat2.setText(aux.substring(60));
                LetrasFiat1.setText(Divisa.toUpperCase());
            } else if (aux.length() < 60) {
                Font fuente = new Font("Arial", Font.BOLD, 16);
                LetrasFiat.setFont(fuente);
                LetrasFiat1.setFont(fuente);
                LetrasFiat.setText(aux);
                LetrasFiat1.setText(Divisa.toUpperCase());
                LetrasFiat2.setVisible(false);
            }
        } else {
            CriptoNombr.setText(Divisa);
            LetrasFiat4.setText(Divisa);
            PriceBTC.setText(Saldoo);
            SaldoFiat1.setText(Saldoo);
            
            ValoBit.setText("VALORIZACIÓN FIAT: " + res.toUpperCase() + " USD");
            LetrasFiat3.setText("VALORIZACIÓN FIAT: " + res.toUpperCase() + " USD");
        }
        if (pt) {
            try {
                Primaria.con = Primaria.Conexion();
                String query = "SELECT Nombre, tipo FROM divisa";
                Statement p = Primaria.con.createStatement();
                ResultSet u = p.executeQuery(query);

                while (u.next()) {
                    if (u.getString(2).equals("Fiat")) {
                        DivisaSelector.addItem(u.getString(1));
                    } else {
                        DivisaSelector1.addItem(u.getString(1));
                        DivisaSelector3.addItem(u.getString(1));
                    }
                }

                Primaria.con.close();
            } catch (SQLException ex) {
                Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String Convert(String t) {
        String p = "";

        for (int i = t.length() - 1, u = 1; i >= 0; i--, u++) {
            if (u % 3 == 0 && u != 0 && i != 0 && t.charAt(i) != '.') {
                p = "." + t.charAt(i) + p;
            } else {
                p = t.charAt(i) + p;
            }
        }

        return p;
    }

    public static String redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado = (resultado - parteEntera) * Math.pow(10, numeroDecimales);
        resultado = Math.round(resultado);
        resultado = (resultado / Math.pow(10, numeroDecimales)) + parteEntera;
        return (resultado + "").replace(".", ",");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label CANTIDAD;
    private javax.swing.JLabel CriptoNombr;
    private javax.swing.JPanel CuentaP;
    private javax.swing.JComboBox<String> DivisaSelector;
    private javax.swing.JComboBox<String> DivisaSelector1;
    private javax.swing.JComboBox<String> DivisaSelector2;
    private javax.swing.JComboBox<String> DivisaSelector3;
    private javax.swing.JButton ENVIAR;
    private javax.swing.JPanel HISTORIAL;
    private javax.swing.JLabel LetrasFiat;
    private javax.swing.JLabel LetrasFiat1;
    private javax.swing.JLabel LetrasFiat2;
    private javax.swing.JLabel LetrasFiat3;
    private javax.swing.JLabel LetrasFiat4;
    private javax.swing.JComboBox<String> OpsCuenta;
    private javax.swing.JPanel PSaldo;
    private javax.swing.JLabel PriceBTC;
    private javax.swing.JButton RETIRAR;
    private javax.swing.JButton RETIRAR2;
    private java.awt.Label SaldoFiat;
    private java.awt.Label SaldoFiat1;
    public javax.swing.JLabel Saludo;
    private javax.swing.JTextField TextoCantidad;
    private javax.swing.JLabel ValoBit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
