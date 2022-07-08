/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete03.*;

/**
 *
 * @author Usuario iTC
 */
public class TransporteAereo extends Transporte{
    private double tarifa;
    
    @Override
    public void establecerTarifa(){
        tarifa = 300.00 + 5.20;
    }
    
    
    @Override
    public double obtenerTarifa(){
        return tarifa;
    }
    
    @Override
    public String toString(){
        String cadena = "Transporte Aereo: " + tarifa + "\n";
        return cadena;
    }
}
