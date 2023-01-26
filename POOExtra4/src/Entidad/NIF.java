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
public class NIF {
    
    private long dni;
    private String caracter;

    public NIF() {
    }

    public NIF(long dni, String caracter) {
        this.dni = dni;
        this.caracter = caracter;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }


}
