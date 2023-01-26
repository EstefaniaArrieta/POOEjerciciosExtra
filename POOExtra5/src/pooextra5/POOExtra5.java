/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra5;

import Entidad.Mes;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class POOExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mes m1=new Mes();
        boolean bandera=false;
        Scanner leer=new Scanner(System.in);
        String r;
        int intento=1;
        
        System.out.println("adivine el mes secreto, coloquelo en minuscula");
        do {  
            System.out.println("este es su intento numero "+intento);
            r=leer.nextLine();
            if (m1.getMesSercreto().equals(r)) {
                bandera=true;
                
            }else{
                System.out.println("intente de nuevo");
            }
            intento++;
            
            
        } while (bandera==false);
        System.out.println("has acertado");
                
        
        // TODO code application logic here
    }
    
}
