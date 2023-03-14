/*Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package javaclases;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Clase4Eje2Guia3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;
      
        System.out.println("Ingrese una frase");
        frase= sc.nextLine();
        
        if(frase.equals("eureka")){
          
            System.out.println("CORRECTO!!");
        }
        else{
            System.out.println("La palabra es Incorrecta");
        }
        
    }
}
