/*
 Realizar un programa que solo permita introducir frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la funcion Lenght() en Java.

 */
package javaclases;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Clase4Eje3Guia3 {

    /**
     *
     * @param args
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase");
        frase = sc.nextLine();
    while(frase.length()!=8){
    System.out.println("Incorrecto, debe escribir una frase de 8 caracteres");
     frase= sc.nextLine();
    }
        System.out.println("Correcto, ingreso una frase de 8 caracteres");
        
        
    }
    
}
