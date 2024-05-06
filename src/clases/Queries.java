/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author mcsmo
 */
public class Queries {

    /*SELECTS*/
    public static String habitacionAll = "SELECT * FROM habitacion";
    public static String usuariosAll = "SELECT usuario.id, usuario.empleado_id, empleado.nombre, usuario.usuario, usuario.clave FROM usuario INNER JOIN empleado ON empleado.id = usuario.empleado_id";
    public static String empleadoAll = "SELECT * FROM empleado";
    public static String huespedesAll = "SELECT registro.id, registro.nombre, registro.telefono, habitacion.habitacion, registro.checkin, registro.checkout FROM registro INNER JOIN habitacion ON habitacion.id = registro.habitacion_id";
    public static String solicitudAll = "SELECT * FROM solicitud";
    public static String registrosAll = "SELECT registro.id, registro.nombre, registro.telefono, habitacion.habitacion, habitacion.tipo_habitacion, habitacion.no_camas, habitacion.no_personas, habitacion.precio, registro.checkin, registro.checkout FROM registro INNER JOIN habitacion ON habitacion.id = registro.habitacion_id";
    //Registro Huespedes
    public static String getIdHabitacion = "SELECT id FROM habitacion WHERE habitacion = ?";
    public static String noRegistroHab = "SELECT habitacion.habitacion, habitacion.tipo_habitacion, habitacion.no_camas, habitacion.no_personas, habitacion.precio FROM habitacion LEFT JOIN registro ON registro.habitacion_id = habitacion.id WHERE registro.habitacion_id IS NULL";
    public static String getInfoHabitacion = "SELECT tipo_habitacion, no_camas, no_personas, precio FROM habitacion where habitacion = ?";
    public static String habitacionesRegistradas = "SELECT habitacion_id FROM registro";

 /*INSERTS*/
    public String InsertEmpleado(String nombre, String apellido, String telefono, String tipoEmpleado) {
        String insert = "INSERT INTO empleado (nombre, apellido, telefono, registro, tipo_empleado) VALUES ('" + nombre + "', '" + apellido + "','" + telefono + "','" + Componentes.FechaActualDB() + "','" + tipoEmpleado + "')";
        return insert;
    }

    public String InsertHabitacion(String habitacion, String tipoH, int camas, int personas, Double precio, String desc) {
        String insert = "INSERT INTO habitacion (habitacion, tipo_habitacion, no_camas, no_personas, precio, descripcion) VALUES ('" + habitacion + "', '" + tipoH + "','" + camas + "','" + personas + "'," + precio + ",'" + desc +"')";
        return insert;
    }

    public String InsertRegistro(String nombre, String telefono, int habitacion_id, String checkout) {
        String insert = "INSERT INTO registro (nombre, telefono, habitacion_id, checkin, checkout) VALUES ('" + nombre + "', '" + telefono + "'," + habitacion_id + ",'" + Componentes.FechaActualDB() + "','" + checkout + "')";
        return insert;
    }

    public String InsertSolicitud(String servicio, String area, String desc, String estado) {
        String insert = "INSERT INTO solicitud (fecha, servicio, area, descripcion, estado) VALUES ('" + Componentes.FechaActualDB() + "', '" + servicio + "','" + area + "','" + desc + "','" + estado + "')";
        return insert;
    }

    /*CHECK-OUT*/
    public String CheckOut(int id) {
    String checkout = "DELETE FROM registro WHERE id ="+id;
    return checkout;
    }
}
