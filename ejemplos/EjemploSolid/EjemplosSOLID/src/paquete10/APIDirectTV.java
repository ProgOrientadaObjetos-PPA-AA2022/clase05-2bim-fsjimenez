/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

import java.io.Serializable;

/**
 *
 * @author Usuario iTC
 */
public class APIDirectTV implements APIMovie, Serializable{
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = String.format("%s%s", ak, 8530136);
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("DirecTV: ");
        
        return cadena;
    }
}
