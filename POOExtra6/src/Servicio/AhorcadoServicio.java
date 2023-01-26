/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class AhorcadoServicio {
    
    public Ahorcado crearA(){
        Scanner leer =new Scanner(System.in);
        String aux;
        
        System.out.println("coloque la palabra con la que jugaremos");
        aux=leer.nextLine();
        String[] palabra=new String[aux.length()];
        for (int i = 0; i < aux.length(); i++) {
            
            palabra[i]=aux.substring(i, i+1);
        }
        System.out.println("coloque la cantidad de vidas que desea para el jugador");
        int intentos=leer.nextInt();
       
        
        
      return new Ahorcado(palabra, 0, intentos);
    }
    
    public int mostrarLon(Ahorcado a1){
        int longitud = a1.getPalabra().length;
        return longitud;
    }
    
    public void buscarLetra(Ahorcado a1){
        Scanner leer=new Scanner(System.in);
        String[] aux=new String[a1.getPalabra().length];
        aux=a1.getPalabra();
        
        
        int count=0;
        int auxint=a1.getIntentos();
        
        int auxcount;
        
        
        do {  
            System.out.println("ingrese la letra que deseo buscar");
            String letra=leer.next();
            auxcount=count;
            for (int i = 0; i < a1.getPalabra().length; i++) {
                if (aux[i].equalsIgnoreCase(letra)) {
                
                    count ++;
                
                }      
            } 
            
            
            if (auxcount==count) {
                System.out.println("esa letra no estaba");
                auxint--;
                a1.setIntentos(auxint);
            }
            System.out.println("ya encontraste "+ count + " letras");
            System.out.println("te quedan "+ auxint+" intentos");
            
        } while (auxint>0);
         
         
        

    }
    
    
    
}
