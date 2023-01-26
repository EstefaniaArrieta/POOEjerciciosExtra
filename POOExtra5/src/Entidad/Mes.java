/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Martin
 */
public class Mes {
    
    
    private static final String[] mes={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private  String mesSercreto= mes[2];

    public Mes() {
        
    }

    public String getMesSercreto() {
        return mesSercreto;
    }

    public void setMesSercreto(String mesSercreto) {
        this.mesSercreto = mesSercreto;
    }
    

    
    
    
}
