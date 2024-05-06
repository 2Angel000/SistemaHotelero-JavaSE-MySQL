/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Globales;
import clases.Queries;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import modelo.Conexion;

/**
 *
 * @author mcsmo
 */
public final class HabDisp extends javax.swing.JPanel {

    private Set<Integer> habitacionesRegistradas = new HashSet<>();

    /**
     * Creates new form HabDisp
     */
    public HabDisp() {
        initComponents();
        AsignarNombres();
        ObtenerHabitacionesRegistradas();
        SetColor();
        HiloActualizar();
    }

private Set<Integer> ObtenerHabitacionesRegistradas() {
    Set<Integer> nuevasHabitacionesRegistradas = new HashSet<>();
    try {
        Conexion conn = new Conexion();
        Connection connection = conn.getConnection();
        PreparedStatement statement = connection.prepareStatement(Queries.habitacionesRegistradas);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            nuevasHabitacionesRegistradas.add(resultSet.getInt("habitacion_id"));
        }
        connection.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return nuevasHabitacionesRegistradas;
}

    // Método para establecer el color de los botones
    public void SetColor() {
        for (int i = 1; i <= 15; i++) {
            JButton button = getButton(i);
            if (habitacionesRegistradas.contains(i)) {
                button.setBackground(Color.RED);
            } else {
                button.setBackground(Color.GREEN);
            }
        }
    }

    private JButton getButton(int number) {
        switch (number) {
            case 1:
                return btnH1;
            case 2:
                return btnH2;
            case 3:
                return btnH3;
            case 4:
                return btnH4;
            case 5:
                return btnH5;
            case 6:
                return btnH6;
            case 7:
                return btnH7;
            case 8:
                return btnH8;
            case 9:
                return btnH9;
            case 10:
                return btnH10;
            case 11:
                return btnH11;
            case 12:
                return btnH12;
            case 13:
                return btnH13;
            case 14:
                return btnH14;
            case 15:
                return btnH15;
            default:
                return null;
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

        lblHabDisp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnH1 = new javax.swing.JButton();
        btnH2 = new javax.swing.JButton();
        btnH3 = new javax.swing.JButton();
        btnH4 = new javax.swing.JButton();
        btnH5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnH6 = new javax.swing.JButton();
        btnH7 = new javax.swing.JButton();
        btnH8 = new javax.swing.JButton();
        btnH9 = new javax.swing.JButton();
        btnH10 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnH11 = new javax.swing.JButton();
        btnH12 = new javax.swing.JButton();
        btnH13 = new javax.swing.JButton();
        btnH14 = new javax.swing.JButton();
        btnH15 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 418));

        lblHabDisp.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblHabDisp.setText("jLabel1");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(222, 222, 222));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnH1.setText("jButton1");
        btnH1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(btnH1);

        btnH2.setText("jButton2");
        btnH2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(btnH2);

        btnH3.setText("jButton3");
        btnH3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(btnH3);

        btnH4.setText("jButton4");
        btnH4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(btnH4);

        btnH5.setText("jButton5");
        btnH5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(btnH5);

        jPanel5.setBackground(new java.awt.Color(222, 222, 222));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        btnH6.setText("jButton1");
        btnH6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(btnH6);

        btnH7.setText("jButton2");
        btnH7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(btnH7);

        btnH8.setText("jButton3");
        btnH8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(btnH8);

        btnH9.setText("jButton4");
        btnH9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(btnH9);

        btnH10.setText("jButton5");
        btnH10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(btnH10);

        jPanel6.setBackground(new java.awt.Color(222, 222, 222));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        btnH11.setText("jButton1");
        btnH11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(btnH11);

        btnH12.setText("jButton2");
        btnH12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(btnH12);

        btnH13.setText("jButton3");
        btnH13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(btnH13);

        btnH14.setText("jButton4");
        btnH14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(btnH14);

        btnH15.setText("jButton5");
        btnH15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(btnH15);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHabDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 663, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHabDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnH1;
    private javax.swing.JButton btnH10;
    private javax.swing.JButton btnH11;
    private javax.swing.JButton btnH12;
    private javax.swing.JButton btnH13;
    private javax.swing.JButton btnH14;
    private javax.swing.JButton btnH15;
    private javax.swing.JButton btnH2;
    private javax.swing.JButton btnH3;
    private javax.swing.JButton btnH4;
    private javax.swing.JButton btnH5;
    private javax.swing.JButton btnH6;
    private javax.swing.JButton btnH7;
    private javax.swing.JButton btnH8;
    private javax.swing.JButton btnH9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblHabDisp;
    // End of variables declaration//GEN-END:variables

    public void AsignarNombres() {
        lblHabDisp.setText(Globales.HabDisp);
        btnH1.setText(Globales.Hb1);
        btnH2.setText(Globales.Hb2);
        btnH3.setText(Globales.Hb3);
        btnH4.setText(Globales.Hb4);
        btnH5.setText(Globales.Hb5);
        btnH6.setText(Globales.Hb6);
        btnH7.setText(Globales.Hb7);
        btnH8.setText(Globales.Hb8);
        btnH9.setText(Globales.Hb9);
        btnH10.setText(Globales.Hb10);
        btnH11.setText(Globales.Hb11);
        btnH12.setText(Globales.Hb12);
        btnH13.setText(Globales.Hb13);
        btnH14.setText(Globales.Hb14);
        btnH15.setText(Globales.Hb15);
    }

    //hilo
    public void HiloActualizar() {
    Timer hilo = new Timer();
    hilo.schedule(new TimerTask() {
        @Override
        public void run() {
            SwingUtilities.invokeLater(() -> {
                Set<Integer> nuevasHabitacionesRegistradas = ObtenerHabitacionesRegistradas();
                if (!habitacionesRegistradas.equals(nuevasHabitacionesRegistradas)) {
                    habitacionesRegistradas = nuevasHabitacionesRegistradas;
                    SetColor();
                }
            });
        }
    }, 0, 1000); 
    
}

}
