package lecturaArchivos2;

// Fig. 14.12: PruebaLeerArchivoTexto.java
import java.util.ArrayList;

public class PruebaLeerArchivoTexto {

    public static void main(String args[]) {
        LeerArchivoTexto aplicacion = new LeerArchivoTexto(); //llamamos a los metodos para leer los archivod
        LeerArchivoTexto2 aplicacion2 = new LeerArchivoTexto2();
        OperacionData operacion = new OperacionData();  //llamamos a los metodos para las operaciones 
        CrearArchivoTexto archivo= new CrearArchivoTexto();
        ArrayList<Profesor> lista_participantes = new ArrayList<>(); 
        aplicacion.abrirArchivo();   //abrimos los archivos llamando a los metodos
        aplicacion2.abrirArchivo2();
        ArrayList<Profesor> lista = aplicacion.leerRegistros(); //creamos las listas para  llenarlas con los datos
        ArrayList<Profesor> listaa = aplicacion2.leerRegistros2();
        for (int i =0; i>lista.size(); i++){
            lista_participantes.add(listaa.get(i));
        }
        for (int i = 0; i < listaa.size(); i++) {
            lista_participantes.add(listaa.get(i));                      
        }
        operacion.agregarInformacion(lista);
        // operacion.lecturaData();

        operacion.ordenarPorCanton();
        ArrayList<Profesor> lista2 = operacion.ordenarPorNombres();
        //llamamos a metodos para abrir archivor y ordenarlos 
        archivo.abrirArchivo();                    
        archivo.agregarRegistros(lista2);          
        operacion.cantidadPersonalidad();           
        operacion.cantidadDictamenIdoniedad();      
        aplicacion.cerrarArchivo();                 
        archivo.cerrarArchivo();
        // System.out.println("-------");
        // operacion.lecturaData();
        aplicacion2.cerrarArchivo();
    } // fin de main
} // fin de la clase PruebaLeerArchivoTexto

