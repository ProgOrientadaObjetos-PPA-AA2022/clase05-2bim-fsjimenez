/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author Usuario iTC
 */
public class Tarjeta {
    private String nombreBan;
    private double cupoMax;
    
    public Tarjeta(String n, double c){
        nombreBan = n;
        cupoMax = c;
    }
    
    public void establecerNombre(String n){ 
        nombreBan = n;
    }
    
    public void establecerCupoMax(double c){
        cupoMax = c;
    }
    
    public String obtenerNombre(){
        return nombreBan;
    }
    
    public double obtenerCupo(){
        return cupoMax;
    }
    
    @Override
    public String toString(){ 
        String cadena = String.format("Nombre del Banco: %s\nCupo Máximo: %.2f\n"
                , nombreBan,
                cupoMax);
        
        return cadena;
    }
}
