/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class NIFServicio {
    
    public NIF crearNIF(){
        
        String caracter= "TRWAGMYFPDXBNJZSQVHLCKE";
        String [] arr=new String[23];
        
        for (int i = 0; i < 23; i++) {
            
            arr[i]=caracter.substring(i, i+1);
            System.out.print(arr[i]);
        }
        System.out.println("");
        
        Scanner leer=new Scanner(System.in);
        System.out.println("a continuacion coloque su numero de dni");
        long dni=leer.nextLong();
        long resto=dni%23;
        String letra="";
        
        for (int i = 0; i < 23; i++) {
            
            if (resto==i) {
                letra=arr[i-1];
            }
        }
            return new NIF(dni, letra);
            
    }
    
    public void mostrarNif(NIF n1){
        System.out.println("su NIF es:");
        System.out.println(n1.getDni()+"-"+n1.getCaracter());
    }
        
        
                
        
    }
    
