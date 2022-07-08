/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerCualitativo(){
        if (promedioEdades >= 0 && promedioEdades <= 21) {
            promedioEdadesCualitativo = "promedio jovenes";
        }else if(promedioEdades > 21){
                promedioEdadesCualitativo = "promedio adulto";
        }
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        
        for(Persona e: obtenerEstudiante()){
            suma += e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    
    public String obtenerPromedioCualitativo(){
        return promedioEdadesCualitativo;
    }
    
    @Override
    public String toString(){
        String cadena = "Lista de Estudiantes: \n";
        int i = 1;
        for (Persona p: obtenerEstudiante()) {
            cadena = String.format("%sEstudiante %d: %s\n", cadena, i,
                    p.obtenerNombre());
            i++;
        }
        cadena = String.format("%s\nPromedio de Edades: %.2f %s", cadena,
                promedioEdades,
                promedioEdadesCualitativo);
        
        
        return cadena;
    }
}
