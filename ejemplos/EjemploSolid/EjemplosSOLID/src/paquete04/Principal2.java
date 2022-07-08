/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Principal2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc;
        
        ArrayList<Transporte> lista = new ArrayList<>();
        
        do {
            System.out.println("Ingrese el tipo de Transporte a ingresar: ");
            System.out.println("1. Aereo\n2. Taxi\n3. Bus\n4. Maritimo");
            opc = entrada.nextInt();

            
            
            switch (opc) {
                case 1:
                    TransporteAereo aereo = new TransporteAereo();
                    aereo.establecerTarifa();
                    lista.add(aereo);
                    break;
                case 2:
                    TransporteTaxi taxi = new TransporteTaxi();
                    taxi.establecerCooperativaTaxi("Yahuarcuna");
                    taxi.establecerTarifa();
                    lista.add(taxi);
                    break;
                case 3:
                    TransporteBus bus = new TransporteBus();
                    bus.establecerCooperativaBus("24 Mayo");
                    bus.establecerTarifa();
                    lista.add(bus);
                    break;
                case 4:
                    TransporteMaritimo maritimo = new TransporteMaritimo();
                    maritimo.establecerTarifa();
                    lista.add(maritimo);
                    break;
                default:
                    System.out.println("Numero no correcto");
                    break;
            }
            
            System.out.println("Pulse 1 para salir del ciclo: ");
            opc = entrada.nextInt();
        } while (opc != 1);
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.println(tipos);

    }
}
