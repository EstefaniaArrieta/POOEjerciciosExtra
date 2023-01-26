/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra4;

import Entidad.NIF;
import Servicio.NIFServicio;

/**
 *
 * @author Martin
 */
public class POOExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIF n1= new NIF();
        NIFServicio sv=new NIFServicio();
        
        n1=sv.crearNIF();
        
        sv.mostrarNif(n1);
        
        
        
        
        
        // TODO code application logic here
    }
    
}
