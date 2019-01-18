/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Gerson
 */
public class LeerArchivoTexto2 {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo2() {
        try {
            entrada = new Scanner(new File("data/data1.csv"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // lee registro del archivo
    public ArrayList<Profesor> leerRegistros2() {

        OperacionData operacion = new OperacionData();
        ArrayList<Profesor> lista = new ArrayList<>(); // creacion de array  tipo profesor
        Profesor p = new Profesor();
        try // lee registros del archivo, usando el objeto Scanner
        {
            
            String linea = entrada.nextLine();
            while (entrada.hasNext()) {
                linea = entrada.nextLine();
                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(",")));    // separamos la cadena por el caracter ","
                
                p.setCedula(linea_partes.get(0)); //llamamos al  objeto  y a cada uno de sus metodos( agregar)
                p.setNombre(linea_partes.get(1));
                p.setZona(linea_partes.get(2));
                p.setProvincia(linea_partes.get(3));
                p.setCanton(linea_partes.get(4));
                p.setPersonalidad(linea_partes.get(5));
                p.setRazonamiento(linea_partes.get(6));
                p.setDirectamenIdoniedad(linea_partes.get(7));
                lista.add(p);     // agregamos a la lista que se va a retornar todos los valores
            } // fin de while

        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista;
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del m�todo cerrarArchivo
}
