package lecturaArchivos2;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import java.util.Formatter;

public class LeerArchivoTexto {

    private Scanner entrada;
    private Formatter salida;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("data/data2.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // lee registro del archivo
    
    public ArrayList<Profesor> leerRegistros() {

        OperacionData operacion = new OperacionData(); //llamamos al metodo operacion data 
        ArrayList<Profesor> lista = new ArrayList<>(); // creamos un array vacia de tipo profesor 

        try // lee registros del archivo, usando el objeto Scanner
        {
            entrada.nextLine();  //salto de linea
            while (entrada.hasNext()) { // mientras  siga habiendo datos en la linea no sale del while
                // se crea el objeto para leer Json
                Gson g = new Gson();
                String linea = entrada.nextLine(); //declaramos  el string linea 
                // se hace el proceso de transformación
                Profesor p = g.fromJson(linea, Profesor.class); //se recorre toda la linea y se va enlazando con el objeto profesor
                lista.add(p); //agregamos a la lista vacia de tipo profesor
                

            } // fin de while

        } // fin de try
        catch (NoSuchElementException elementException) {   //excepciones
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
} // fin de la clase LeerArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
