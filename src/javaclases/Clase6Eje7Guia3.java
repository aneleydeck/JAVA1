/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee 
cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un 
máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” 
marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato
se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan
las siguientes funciones de Java Substring(), Length(), equals().
 */
package javaclases;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Clase6Eje7Guia3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String cadena;
        int correcto=0;
        int incorrecto=0;
        
        do {
            System.out.println("Ingrese una palabra de 5 caracteres");
            cadena = sc.nextLine();
            /*if (cadena.length() != 5) {
                System.out.println("Incorrecto, debe ingresar una palabra de 5 caracteres");
            }
            else*/
            if (cadena.substring(0,1).equals("X") && cadena.substring(cadena.length()-1,cadena.length()).equals("O") && cadena.length()<=5){
            correcto+=1;
            }
            else if(!cadena.equals("&&&&&")){
                
            incorrecto+=1;
                 
            }
            
        } while (!cadena.equals("&&&&&"));
        
        System.out.println("La suma de correctos es "+ correcto);
        System.out.println("La suma de incorrectos es "+ incorrecto);
        
        
    }
    
}
