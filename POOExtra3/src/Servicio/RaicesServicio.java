/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;

/**
 *
 * @author Martin
 */
public class RaicesServicio {
    
    public double getDiscriminante(Raices r1){
        double discriminante= (r1.getB()*r1.getB())-4*r1.getA()*r1.getC();
        
        return discriminante; 
        
    }
    
    public boolean tieneRaices(Raices r1){
        
        boolean bandera=false;
        if (getDiscriminante(r1)>=0) {
            bandera=true;
        }
                
        return bandera;
        
    }
    
    public boolean tieneRaiz(Raices r1){
        
        boolean bandera=false;
        if (getDiscriminante(r1)==0) {
            bandera=true;
        }
                
        return bandera;
        
    }
    
}
