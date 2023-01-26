/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra3;

import Entidad.Raices;
import Servicio.RaicesServicio;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class POOExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer= new Scanner(System.in);
        RaicesServicio sv= new RaicesServicio();
        
        System.out.println("a continuacion se le pediran 3 numeros");
        Raices r1=new Raices(leer.nextDouble(), leer.nextDouble(), leer.nextDouble());
        
        System.out.println("tiene mas de 2 soluciones?" + sv.tieneRaices(r1));
        System.out.println("tiene una sola solucion?" + sv.tieneRaiz(r1));
        
        
        
        
    }
    
}
