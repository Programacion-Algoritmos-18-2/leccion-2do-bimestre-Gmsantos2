/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

/**
 *
 * @author Gerson
 */
/*
{"cedula":"1803742806","nombres":"MULLO ROMERO ESTHER DEL CARMEN", 
"zona":"ZONA 3","provincia":"TUNGURAHUA", 
"canton":"AMBATO", "personalidad": "POR CONVOCAR", 
"razonamiento":"POR CONVOCAR", 
"dictamenIdoniedad":"NO IDONEO"}
*/

public class Profesor {
    String cedula;
    String nombres;
    String zona;
    String provincia;
    String canton;
    String personalidad;
    String razonamiento;
    String dictamenIdoniedad;
    
    public void setCedula(String cedula){           // metodo set de la Clase
        this.cedula=cedula;
    }
    public void setNombre(String nombres){
        this.nombres=nombres;
    }
    public void setZona(String zona){
        this.zona=zona;
    }
    public void setProvincia(String provincia){
        this.provincia=provincia;
    }
    public void setCanton(String canton){
        this.canton=canton;
    }
    public void setPersonalidad(String personalidad){
        this.personalidad=personalidad;
    }
    public void setRazonamiento(String razonamiento){
        this.razonamiento=razonamiento;
    }
    public void setDirectamenIdoniedad(String dictamenIdoniedad){
        this.dictamenIdoniedad=dictamenIdoniedad;
    }
    public String getCedula(){                  
       return this.cedula; 
    }
    public String getNombres(){
       return this.nombres; 
    }
    public String getZona(){
       return this.zona; 
    }
    public String getProvincia(){
       return this.provincia; 
    }
    public String getCanton(){
       return this.canton; 
    }
    public String getPersonalidad(){
       return this.personalidad; 
    }
    public String getRazonamiento(){
       return this.razonamiento; 
    }
    public String getDirectamenIdoniedad(){
       return this.dictamenIdoniedad; 
    }
    @Override
    public String toString(){               // Metodo toString de la clase Para presentar los datos
        return String.format("%s - %s - %s - %s - %s - %s - %s - %s\n", getCedula(),getNombres(),getZona(),getProvincia(),getCanton(),getPersonalidad(),getRazonamiento(),getDirectamenIdoniedad());
    }
}







