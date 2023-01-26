/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra2;

import Entidad.Punto;
import Servicio.PuntoServicio;

/**
 *
 * @author Martin
 */
public class POOExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Punto p1=new Punto();
        PuntoServicio sv=new PuntoServicio();
        
        p1=sv.crearPunto();
        
        System.out.println("la distancia entre ambos puntos es" + sv.calcDist(p1));
        
        
        
        
        // TODO code application logic here
    }
    
}
