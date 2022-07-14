/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class Principal2 {
    public static void main(String[] args) {
        
        String nombreArchivo = "peliculas.data";
        
        ArrayList<GeneradorPeliculas> pelis = new ArrayList<>();
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        pelis.add(gp);
        
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        pelis.add(gp2);
        
        
        APIDirectTV api3 = new APIDirectTV();
        api3.establecerApiKey("35646");
        
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        pelis.add(gp3);
        
        APIStarPlus api4 = new APIStarPlus();
        api4.establecerApiKey("000");
        
        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        pelis.add(gp4);
        
        EscrituraArchivoSecuencial archivo = new
        EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < pelis.size(); i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(pelis.get(i));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }
        
        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaPeliculas();
        System.out.println(lectura);
       
    }
}
