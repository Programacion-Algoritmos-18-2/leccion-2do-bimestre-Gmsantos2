/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;
import java.io.FileNotFoundException;               
import java.lang.SecurityException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CrearArchivoTexto {                    //Clase crearArchivoTexto

    private Formatter salida;       // Objeto salida tipo formatter

    public void abrirArchivo() {    
        try {                       
            salida = new Formatter("data/OrdenaNombres.csv");    //Creamos un archivo en la direccion de la carpeta 
        } // fin de try
        catch (SecurityException securityException) {          
            System.err.println("No tiene acceso de escritura a este archivo."); 
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {  
            System.err.println("Error al crear el archivo."); 
            System.exit(1);
        } // fin de catch
    }

    public void agregarRegistros(ArrayList<Profesor> lista) { // Metodo para Agregar registros al archivo
        try {               
            for (int i = 0; i < lista.size(); i++) {    
                Profesor p = lista.get(i); 
                salida.format("%s - %s - %s - %s - %s - %s - %s - %s\n", p.getCedula(), p.getNombres(), p.getZona(), p.getProvincia(), p.getCanton(), p.getPersonalidad(),p.getRazonamiento(), p.getDirectamenIdoniedad());
            }      
        } catch (FormatterClosedException formatterClosedException) {      
            System.err.println("Error al escribir en el archivo.");
            return;
        } // fin de catch
        catch (NoSuchElementException elementException) {
            System.err.println("Entrada invalida. Intente de nuevo.");
        } // fin de catch

    } 
    public void cerrarArchivo() {       // Metodo que cerrara el archivo 
        if (salida != null) {
            salida.close();         
        }
    }
} 