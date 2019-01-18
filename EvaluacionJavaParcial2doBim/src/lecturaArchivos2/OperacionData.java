/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Gerson
 */
public class OperacionData {

    Scanner entrada = new Scanner(System.in);
    ArrayList<Profesor> informacion = new ArrayList<>();

    public void agregarInformacion(ArrayList<Profesor> info) {
        //informacion = new ArrayList<Profesor>(info.subList(1, 4));
        informacion = info;
    }

    public ArrayList<Profesor> obtenerInformacion() {
        return informacion;
    }

    public double obtenerPromedioCapacidad() {
        double suma = 0;
        return suma;
    }

    // proceso de ordenar, a través del uso de Collections
    public void ordenarPorCanton() {
        ArrayList<Profesor> dataPorCantones = new ArrayList<>();
        dataPorCantones.addAll(informacion);
        Collections.sort(dataPorCantones,
                (o1, o2) -> o1.canton.compareTo(o2.canton));
        for (int i = 0; i < dataPorCantones.size(); i++) {
            System.out.println(dataPorCantones.get(i));
        }
    }

    public void cantidadPersonalidad() {                 // Metodo para Calcular la cantidad de Personalidad 
        int cont1 = 0, cont2 = 0;                         // inicializacionde variables
        

        for (int i = 0; i < this.informacion.size(); i++) {
            if (this.informacion.get(i).getPersonalidad().equals("ADECUADO")) {         // if en caso de ser adecuado se suma en uno el cont
                cont1 += 1;
            } else {                              
                if (this.informacion.get(i).getPersonalidad().equals("POR CONVOCAR")) { // if en caso de ser por convocar se suma en 1 el contador 2 
                    cont2 += 1; 
                }
            }

        }
        System.out.printf("ADECUADO : %d  POR CONVOCAR : %d\n", cont1, cont2);    // Presentamos el valor de los contadores
    }

    public void cantidadDictamenIdoniedad() {        
        int cont1 = 0, cont2 = 0;                       
        // Estado de el atributo

        for (int i = 0; i < this.informacion.size(); i++) {
            if (this.informacion.get(i).getDirectamenIdoniedad().equals("IDONEO")) {        // if en caso de ser idoneo se suma en uno el cont
                cont1 += 1;
            } else {                              
                if (this.informacion.get(i).getDirectamenIdoniedad().equals("NO IDONEO")) {// if en caso de ser no idoneo se suma en uno el cont
                    cont2 += 1;
                }
            }

        }
        System.out.printf("IDONEO : %d  NO IDONEO : %d\n", cont1, cont2);    // Presentamos el valor de los contadores
        
    }

    public ArrayList<Profesor> ordenarPorNombres() {
        ArrayList<Profesor> dataPorNombres = new ArrayList<>();
        dataPorNombres.addAll(informacion);
        Collections.sort(dataPorNombres,
                (o1, o2) -> o1.nombres.compareTo(o2.nombres));
        return dataPorNombres;

    }

    public void lecturaData() {
        for (int i = 0; i < obtenerInformacion().size(); i++) {
            System.out.println(obtenerInformacion().get(i));

        }

    }

}
