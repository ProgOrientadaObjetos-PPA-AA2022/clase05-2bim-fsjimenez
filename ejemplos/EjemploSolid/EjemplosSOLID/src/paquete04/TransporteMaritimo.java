/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author Usuario iTC
 */
public class TransporteMaritimo extends Transporte{
    private double tarifa;
    
    @Override
    public void establecerTarifa(){
        tarifa = 45.00 + 5.20;
    }
    
    
    @Override
    public double obtenerTarifa(){
        return tarifa;
    }
    
    @Override
    public String toString(){
        String cadena = "Transporte Maritimo: " + tarifa + "\n";
        return cadena;
    }
}
