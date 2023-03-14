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
public class Clase1Eje5Guia2 {
    public static void main (String[] args) {
        int num, doble, triple, raiz;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num= leer.nextInt();
        doble= num*2;
       triple= num*3;
        raiz= (int) Math.sqrt(num);
        System.out.println("El doble es: " + doble + " el triple es " + triple + " la raiz es " + raiz);
             
                
    }
}
