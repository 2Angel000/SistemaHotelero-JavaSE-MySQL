package clases;

import interfaces.*;

public class Frames {
    
    public static void abrirHome(){
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
    }
    
    public static void CerrarSesion(){
        InicioSesion inicioSesion = new InicioSesion();
        inicioSesion.setVisible(true);
    }
    
}
