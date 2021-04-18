/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfoPersonal;

/**
 *
 * @author Familia Garcia A
 */
public class InfoPersonal {
    String nombre_aprendiz = "Juan José Pizarro Valencia";
    int edad_aprendiz = 22;
    String estado_civil = "Soltero";
    int cantidad_hijos= 0;
    boolean en_cuarentena = true;
    String municipio_residencia = "Manizales - Caldas";
    
    //Metodo
    public void imprimirmensajedelmetodo(){
      System.out.println(nombre_aprendiz + " " + edad_aprendiz + " " + estado_civil + " " +  cantidad_hijos + " " + en_cuarentena + " "  + municipio_residencia);
    }
    
     public String imprimirmensajedelafuncion(){
    String mensaje_concatenado = nombre_aprendiz + " " + edad_aprendiz + " " + estado_civil + " " +  cantidad_hijos + " " + en_cuarentena + " "  + municipio_residencia;
    return mensaje_concatenado;
    }
    public String imprimirmensajedelafuncion1(){
    String mensaje_concatenado = nombre_aprendiz + "\n" + edad_aprendiz + "\n" + estado_civil + "\n" +  cantidad_hijos + "\n" + en_cuarentena + "\n"  + municipio_residencia;
    return mensaje_concatenado;
    }
    public String imprimirmensajedelafuncion2(){
    String mensaje_concatenado = "Mi nombre es " + nombre_aprendiz + "\n" + "tengo " + edad_aprendiz + "años " + "\n" + "mi estado civil es " + estado_civil + "\n" + "tengo " + cantidad_hijos +  " hijos " + "\n" + en_cuarentena + " aplico la cuarentena " + "\n" + "lo anterior, debido a que vivo en el municipio de "+ municipio_residencia;
    return mensaje_concatenado;
    }
    

    public static void main(String args []){
    InfoPersonal instClass = new InfoPersonal ();
    System.out.println ("*****************SALIDA METODO************************ ");
    instClass.imprimirmensajedelmetodo();
    System.out.println ("\n****************SALIDA FUNCIONES************************ ");
    System.out.println(instClass.imprimirmensajedelafuncion ());
    System.out.println ("\n****************SALIDA FUNCION CON SALTO DE LINEA************************ ");
    System.out.println(instClass.imprimirmensajedelafuncion1 ());
    System.out.println ("\n****************SALIDA FUNCION CON TEXTO INCLUIDO************************ ");
    System.out.println(instClass.imprimirmensajedelafuncion2 ());
    
    
    }
}