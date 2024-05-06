/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Conexion;

/**
 *
 * @author mcsmo
 */
public class Componentes {

    public static String HoraActual() {
        LocalDateTime horaLocal = LocalDateTime.now();
        int horas = horaLocal.getHour();
        int minutos = horaLocal.getMinute();
        return Globales.hora + horas + ":" + minutos ;
    }
    
    public static String FechaActual(){
        Date fecha = new Date();
        return new SimpleDateFormat("dd-MM-yyyy").format(fecha);
    }
    
    public static String FechaActualDB(){
        Date fecha = new Date();
        return new SimpleDateFormat("yyyy-MM-dd").format(fecha);
    }
}
