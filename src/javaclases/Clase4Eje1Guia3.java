/*Crear un programa que dado un número determine si es par o impar
if(<condición>){
  <sentencias A>
} else {
   <sentencias B>
}      	 
 */
package javaclases;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Clase4Eje1Guia3 {
    public static void main (String[] args){
        
         Scanner sc = new Scanner (System.in);
         int num;
         System.out.println("Ingrese un numero");
         num=sc.nextInt();
         
         if (num%2==0){
             System.out.println("El numero ingresado es Par");
                     }
         else {
             System.out.println("El numero ingresado es Impar");
         }
         
        
        
        
        
    }
    
}
