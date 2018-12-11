/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_bancario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Jorge M
 */
public class EmpCRD extends javax.swing.JInternalFrame {
    //CREDITO
    /**
     * Creates new form EmpCRD
     */
    public EmpCRD() {
        initComponents();
        jLabel10.setText("");
        jLabel11.setText("");
        jLabel12.setText("");
        jLabel13.setText("");
        jLabel14.setText("");
        jLabel15.setText("");
        jButton1.setText("Aceptar");
        jButton2.setText("Denegar");
        jButton1.setVisible(false);
        jButton2.setVisible(false);
    }
    
    Connection con = null;
    String Consulta = "";
    String Nuevo = "";
    ResultSet rs = null;

    public class cronometro implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            GregorianCalendar tiempo = new GregorianCalendar();
            int hora,min,seg;
            hora=tiempo.get(Calendar.HOUR);
            min=tiempo.get(Calendar.MINUTE);
            seg=tiempo.get(Calendar.SECOND);
            if (hora == 0) {
                jLabel23.setText("12");
            }
            if (hora < 10 && hora >= 0) {
                jLabel23.setText("0"+String.valueOf(hora));
            }
            if (hora >= 10 && hora <= 24) {
                jLabel23.setText(String.valueOf(hora));
            }
            if (min >= 0 && min < 10) {
                jLabel20.setText("0"+String.valueOf(min));
            }
            else{
                jLabel20.setText(String.valueOf(min));
            }
            jLabel19.setText(String.valueOf(seg));
        }
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancel.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jToolBar2.setRollover(true);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancel.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton5);

        setBorder(null);
        setClosable(true);
        setMaximizable(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Observaciones:");
        jLabel1.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(110, 20));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 210, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Valor Cuota:");
        jLabel2.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Dia Corte:");
        jLabel3.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(110, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Solicitudes:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 100, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cedula:");
        jLabel5.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel5.setPreferredSize(new java.awt.Dimension(110, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Tipo Credito:");
        jLabel9.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel9.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel9.setPreferredSize(new java.awt.Dimension(110, 20));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aceptar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 110, 40));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Denegar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 120, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("jLabel10");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel10.setMaximumSize(new java.awt.Dimension(60, 14));
        jLabel10.setMinimumSize(new java.awt.Dimension(60, 14));
        jLabel10.setPreferredSize(new java.awt.Dimension(160, 14));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, 40));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("jLabel11");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel11.setMaximumSize(new java.awt.Dimension(60, 14));
        jLabel11.setMinimumSize(new java.awt.Dimension(60, 14));
        jLabel11.setPreferredSize(new java.awt.Dimension(160, 14));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 250, 40));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("jLabel12");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel12.setMaximumSize(new java.awt.Dimension(60, 14));
        jLabel12.setMinimumSize(new java.awt.Dimension(60, 14));
        jLabel12.setPreferredSize(new java.awt.Dimension(160, 14));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 250, 40));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jLabel13");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel13.setMaximumSize(new java.awt.Dimension(60, 14));
        jLabel13.setMinimumSize(new java.awt.Dimension(60, 14));
        jLabel13.setPreferredSize(new java.awt.Dimension(160, 14));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 250, 40));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("jLabel14");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel14.setMaximumSize(new java.awt.Dimension(60, 14));
        jLabel14.setMinimumSize(new java.awt.Dimension(60, 14));
        jLabel14.setPreferredSize(new java.awt.Dimension(160, 14));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 250, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("jLabel15");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel15.setMaximumSize(new java.awt.Dimension(60, 14));
        jLabel15.setMinimumSize(new java.awt.Dimension(60, 14));
        jLabel15.setPreferredSize(new java.awt.Dimension(190, 14));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 250, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Cuotas:");
        jLabel17.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel17.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel17.setPreferredSize(new java.awt.Dimension(110, 20));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 40, 10));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("00");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 30, 20, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("00");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 20, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText(":");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 30, 20, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(".");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 20, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("00");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 30, 20, 20));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancel.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 40, 28));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 790, 370));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel24.setText("Revisión de créditos");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 340, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel16.setText("del usuario");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 190, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // ACEPTAR
        Nuevo = "UPDATE credito SET Estado='"+"Aprobado"+"' WHERE CedulaUsuario="+Integer.valueOf(jLabel10.getText())+";";
        
        try{
           bGUI p = new bGUI();
           p.con = p.Conexion();
           p.con.createStatement().execute(Nuevo);
           JOptionPane.showMessageDialog(null, "Registro modificado correctamente","Sistema",1);
           Cls();
        }
        catch(SQLException err){
           JOptionPane.showMessageDialog(null, err.getMessage(),"Sistema",0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // DENEGAR
        Nuevo = "UPDATE credito SET Estado='"+"Denegado"+"' WHERE CedulaUsuario="+Integer.valueOf(jLabel10.getText())+";";
        
        try{
           bGUI p = new bGUI();
           p.con = p.Conexion();
           p.con.createStatement().execute(Nuevo);
           JOptionPane.showMessageDialog(null, "Registro modificado correctamente","Sistema",1);
           Cls();
        }
        catch(SQLException err){
           JOptionPane.showMessageDialog(null, err.getMessage(),"Sistema",0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // SALIR
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        timer = new Timer(1000, new cronometro());
        timer.start();
        Nuevo = "Select * from credito WHERE Estado='Espera Confirmacion' ORDER BY NoCredito;";
        try{
            bGUI p = new bGUI();
            p.con = p.Conexion();
            rs = p.con.createStatement().executeQuery(Nuevo);
            while(rs.next()){
                jComboBox1.addItem(rs.getString("NoCredito").toString());
            }
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage(),"Sistema",0);
        }
        
        
        
    }//GEN-LAST:event_formComponentShown

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // ITEM CHANGED
        if (jComboBox1.getSelectedItem().equals("----")) {
            jLabel10.setText("");
            jLabel11.setText("");
            jLabel12.setText("");
            jLabel13.setText("");
            jLabel14.setText("");
            jLabel15.setText("");
            
            jButton1.setVisible(false);
            jButton2.setVisible(false);
        }
        else{
            Nuevo = "SELECT * FROM credito WHERE NoCredito='"+jComboBox1.getSelectedItem().toString()+"';";
            jButton1.setVisible(true);
            jButton2.setVisible(true);
            try{
                bGUI p = new bGUI();
                p.con = p.Conexion();
                rs = p.con.createStatement().executeQuery(Nuevo);
                rs.last();
                int numreg = rs.getRow();
                if (numreg > 0) {
                    int CedulaUsuario = rs.getInt(2);
                    int Tipo = rs.getInt(3);
                    double Cuotas = rs.getDouble(5);
                    double ValorCu = rs.getDouble(6);
                    int DiaCorte = rs.getInt(7);

                    jLabel10.setText(String.valueOf(CedulaUsuario));
                    jLabel11.setText(String.valueOf(Tipo));
                    jLabel12.setText(String.valueOf(Cuotas));
                    jLabel13.setText(String.valueOf(ValorCu));
                    jLabel14.setText(String.valueOf(DiaCorte));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Solicitud No Encontrada","Sistema",1);
                }
            }
            catch(SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage(),"Sistema",0);
            }

            Nuevo = "SELECT * FROM tipocredito WHERE Id="+Integer.valueOf(jLabel11.getText())+";";
            try{
                bGUI p = new bGUI();
                p.con = p.Conexion();
                rs = p.con.createStatement().executeQuery(Nuevo);
                rs.last();
                int numreg = rs.getRow();
                if (numreg > 0) {
                    String Obser = rs.getString(4);
                    jLabel15.setText(String.valueOf(Obser));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Tipo Credito No Encontrado","Sistema",1);
                }
            }
            catch(SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage(),"Sistema",0);
            }
        }
            
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private Timer timer;
    
    public void Cls(){
        jLabel10.setText("");
        jLabel11.setText("");
        jLabel12.setText("");
        jLabel13.setText("");
        jLabel14.setText("");
        jLabel15.setText("");
        
        jComboBox1.setSelectedItem(0);
        
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
