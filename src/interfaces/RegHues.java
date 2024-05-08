/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Componentes;
import clases.Globales;
import clases.Queries;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Conexion;

/**
 *
 * @author mcsmo
 */
public final class RegHues extends javax.swing.JPanel {

    PreparedStatement ps, pst;
    Statement instruccion;
    ResultSet rs;
    Conexion conn = new Conexion();
    Connection conectar = conn.getConnection();
    Queries insert = new Queries();
    Reservas reservas = new Reservas();

    /**
     * Creates new form RegHues
     */
    public RegHues() {
        initComponents();
        AsignarNombres();
        reservas.VerRegistros();
       RellenarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        lblRegistrarHuespedes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        sHabitacion = new javax.swing.JComboBox<>();
        txtNoCamas = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCheckIn = new javax.swing.JTextField();
        txtCheckOut = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtDesde = new javax.swing.JTextField();
        txtHasta = new javax.swing.JTextField();
        lblNNoches = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        txtTipoHabitacion = new javax.swing.JTextField();
        txtPersonasP = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 418));

        lblRegistrarHuespedes.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblRegistrarHuespedes.setText("jLabel1");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 669));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        sHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        sHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        sHabitacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)), "Habitación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        sHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sHabitacionActionPerformed(evt);
            }
        });

        txtNoCamas.setBackground(new java.awt.Color(255, 255, 255));
        txtNoCamas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNoCamas.setForeground(new java.awt.Color(0, 0, 0));
        txtNoCamas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)), "No. Camas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        txtNoCamas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNoCamas.setEnabled(false);
        txtNoCamas.setSelectionColor(new java.awt.Color(0, 153, 153));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)), "Precio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        txtPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPrecio.setEnabled(false);
        txtPrecio.setSelectionColor(new java.awt.Color(0, 153, 153));

        txtCheckIn.setBackground(new java.awt.Color(255, 255, 255));
        txtCheckIn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCheckIn.setForeground(new java.awt.Color(0, 0, 0));
        txtCheckIn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)), "Check-In", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        txtCheckIn.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCheckIn.setEnabled(false);
        txtCheckIn.setSelectionColor(new java.awt.Color(0, 153, 153));

        txtCheckOut.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCheckOut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)), "Check-Out (AAAA-MM-DD)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        txtCheckOut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCheckOutKeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtDesde.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDesde.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)), "Desde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N

        txtHasta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtHasta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)), "Hasta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N

        lblNNoches.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblNNoches.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(txtDesde)
                    .addComponent(lblNNoches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblNNoches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnEnviar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/send.png"))); // NOI18N
        btnEnviar.setText("jButton1");
        btnEnviar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enviando.png"))); // NOI18N
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)), "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtTipoHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTipoHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoHabitacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)), "Tipo de Habitación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 16))); // NOI18N
        txtTipoHabitacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTipoHabitacion.setEnabled(false);
        txtTipoHabitacion.setSelectionColor(new java.awt.Color(0, 153, 153));

        txtPersonasP.setBackground(new java.awt.Color(255, 255, 255));
        txtPersonasP.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPersonasP.setForeground(new java.awt.Color(0, 0, 0));
        txtPersonasP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)), "No. Personas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 16))); // NOI18N
        txtPersonasP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPersonasP.setEnabled(false);
        txtPersonasP.setSelectionColor(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNoCamas)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                    .addComponent(txtCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtPersonasP))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(txtCheckOut)))
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTipoHabitacion))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(603, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombre)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sHabitacion)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
                    .addComponent(txtTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNoCamas, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                            .addComponent(txtPersonasP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(70, 70, 70)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRegistrarHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 534, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1339, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRegistrarHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String insertQuery;
    try {
        String nombre = txtNombre.getText();
        String telefono = txtTelefono.getText();
        String checkout = txtCheckOut.getText();
        //obteniendo el indice de hab
        String nombreHabitacion = (String) sHabitacion.getSelectedItem();
        instruccion = conectar.createStatement();
        try (PreparedStatement st = conectar.prepareStatement(Queries.getIdHabitacion)) {
            st.setString(1, nombreHabitacion);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                //obtener id
                int idHabitacion = rs.getInt("id");
                insertQuery = insert.InsertRegistro(nombre, telefono, idHabitacion, checkout);
                instruccion.execute(insertQuery);
                
                // Eliminar la habitación seleccionada del ComboBox
                sHabitacion.removeItem(nombreHabitacion);
                 RellenarCombo();
                // Actualizar los registros en la tabla dentro del otro JPanel
                reservas.VerRegistros();
                
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "La habitación seleccionada no se encontró en la base de datos");
            }
        }
        //conectar.close();
        txtHasta.setText(checkout);
        } catch (SQLException ex) {
            Logger.getLogger(RegHues.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnEnviarActionPerformed

    private void sHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sHabitacionActionPerformed
        try {
            String nombreHabitacion = (String) sHabitacion.getSelectedItem();
            try (PreparedStatement st = conectar.prepareStatement(Queries.getInfoHabitacion)) {
                st.setString(1, nombreHabitacion);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    String tipoHab = rs.getString("tipo_habitacion");
                    String no_camas = rs.getString("no_camas");
                    String no_personas = rs.getString("no_personas");
                    String precio = rs.getString("precio");

                    txtTipoHabitacion.setText(tipoHab);
                    txtNoCamas.setText(no_camas);
                    txtPersonasP.setText(no_personas);
                    txtPrecio.setText(precio);
                } else {
                    JOptionPane.showMessageDialog(null, "Habitacion inexistente");
                    RellenarCombo();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegHues.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sHabitacionActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        int key = evt.getKeyChar();
        boolean numerico = key >= 48 && key<=57;
        
        if(!numerico){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
        if(txtTelefono.getText().trim().length() == 10){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length() >= 50){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCheckOutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCheckOutKeyTyped
      char c = evt.getKeyChar();
    if (!((c >= '0' && c <= '9') || c == '-' || c == KeyEvent.VK_BACK_SPACE)) {
        evt.consume(); // Consume el evento para evitar que se ingrese el carácter
        Toolkit.getDefaultToolkit().beep(); // Emite un sonido de advertencia
    }

    // Verifica la longitud del texto para controlar el formato
    int length = txtCheckOut.getText().length();
    if (length == 4 || length == 7) {
        if (c != '-') {
            evt.consume(); // Consume el evento si no se ingresa un guion en las posiciones adecuadas
        }
    } else if (length >= 10) {
        evt.consume(); // Limita la longitud del texto a 10 caracteres (yyyy-mm-dd)
    }
    }//GEN-LAST:event_txtCheckOutKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNNoches;
    private javax.swing.JLabel lblRegistrarHuespedes;
    private javax.swing.JComboBox<String> sHabitacion;
    private javax.swing.JTextField txtCheckIn;
    private javax.swing.JTextField txtCheckOut;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtHasta;
    private javax.swing.JTextField txtNoCamas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPersonasP;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoHabitacion;
    // End of variables declaration//GEN-END:variables

    public void AsignarNombres() {
        lblRegistrarHuespedes.setText(Globales.RegHues);
        lblNNoches.setText(Globales.nNoches);
        btnEnviar.setText(Globales.enviar);
        txtCheckIn.setText(Componentes.FechaActual());
        txtDesde.setText(Componentes.FechaActual());
        txtDesde.setEnabled(false);
        txtHasta.setEnabled(false);
    }

    private void Limpiar() {
        txtNombre.setText("");
        txtTelefono.setText("");
        txtTipoHabitacion.setText("");
        txtNoCamas.setText("");
        txtPersonasP.setText("");
        txtPrecio.setText("");
        txtCheckOut.setText("");
    }

    public void RellenarCombo() {
        try {
            Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery(Queries.noRegistroHab);
            sHabitacion.removeAllItems();
            while (rs.next()) {
                String habitacion = rs.getString("habitacion");
                sHabitacion.addItem(habitacion);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

}
