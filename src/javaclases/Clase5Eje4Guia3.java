
import java.util.Scanner;

/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Substring y equals() de Java.
package javaclases;

/**
 *
 * @author usuario
 */
public class Clase5Eje4Guia3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String letra, palabra;
        System.out.println("INGRESE UNA PALABRA QUE EMPIECE CON A/a");
        palabra= sc.nextLine();
        letra= palabra.substring(0,1);
        
        if(letra.equals("a")|| letra.equals("A")){
            System.out.println("CORRECTO");
        }
        else 
            System.out.println("INCORRECTO");
  
        
    }
    
    
}
