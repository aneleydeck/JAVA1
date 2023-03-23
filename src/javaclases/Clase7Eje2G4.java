/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclases;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
 
public class Clase7Eje2G4 {
   
    public static Scanner leer = new Scanner (System.in);
    public static void main(String[] args) {
        String opcion;
            do {
             datos();
                System.out.println("Desea ingresar mas datos? (S/N)");
                opcion = leer.next();
                
                } while ("s".equalsIgnoreCase(opcion));
    }
    public static void datos () {
        System.out.println("Ingrese los datos de la persona");
        
        System.out.println("Nombre");
        String nombre = leer.next();
        
        System.out.println("Edad");
        int edad = leer.nextInt();
        
        if (edad > 18) {
            System.out.println(nombre + " es MAYOR de edad.");
        } else {
            System.out.println(nombre + " es MENOR de edad.");
        }
    }
}
    

