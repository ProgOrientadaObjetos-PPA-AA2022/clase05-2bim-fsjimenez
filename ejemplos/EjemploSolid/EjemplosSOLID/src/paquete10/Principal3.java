/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

/**
 *
 * @author Usuario iTC
 */
public class Principal3 {
    public static void main(String[] args) {
     String nombreArchivo = "peliculas.data";

    LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);

    lectura.establecerListaPeliculas();

    System.out.println(lectura);   
    }
    

}
