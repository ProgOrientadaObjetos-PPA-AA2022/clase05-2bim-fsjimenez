/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author Usuario iTC
 */
public class TransporteAereo {
    private double tarifa;
    
    
    public void establecerTarifa(){
        tarifa = 300.00 + 5.20;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
