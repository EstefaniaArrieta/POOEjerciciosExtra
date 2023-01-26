/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra6;

import Entidad.Ahorcado;
import Servicio.AhorcadoServicio;

/**
 *
 * @author Martin
 */
public class POOExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ahorcado a1=new Ahorcado();
        AhorcadoServicio sv=new AhorcadoServicio();
        
        a1=sv.crearA();
        
        System.out.println("la longitud de la palabra a adivinar es; "+ sv.mostrarLon(a1));
        
        sv.buscarLetra(a1);
        // TODO code application logic here
    }
    
}
