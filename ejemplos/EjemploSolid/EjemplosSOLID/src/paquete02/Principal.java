/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Persona est1 = new Persona("Jose", 20);
        Persona est2 = new Persona("Sebastian", 21);
        Persona est3 = new Persona("Sofia", 22);
        
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(est1);
        lista.add(est2);
        lista.add(est3);
        
        OperacionesEstudiantes op = new OperacionesEstudiantes();
        op.establecerEstudiante(lista);
        op.establecerPromedioEdades();
        op.establecerCualitativo();
        
        System.out.println(op);
    }
}
