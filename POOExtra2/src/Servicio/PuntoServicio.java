/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Punto;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class PuntoServicio {
    
    public Punto crearPunto(){
        Scanner leer=new Scanner(System.in);
        System.out.println("coloque x1");
        int x1=leer.nextInt();
        System.out.println("coloque y1");
        int y1=leer.nextInt();
        System.out.println("coloque x2");
        int x2=leer.nextInt();
        System.out.println("coloque y2");
        int y2=leer.nextInt();
        
        return new Punto(x1, y1, x2, y2);
    }
    
    public double calcDist(Punto p1){
        
        double distancia=Math.sqrt((Math.pow(2, (p1.getX2()-p1.getX1()))) + (Math.pow(2, (p1.getY2()-p1.getY1())) ));
        
        return distancia;
    }
    
}

