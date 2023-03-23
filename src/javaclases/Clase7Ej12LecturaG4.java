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
public class Clase7Ej12LecturaG4 {
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numeros para determinar si son multiplos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        multiplo(num1,num2);
    
    }


    
    public static void multiplo(int num1,int num2) {
        
        if ((num2 % num1)==0) {
            System.out.println(num2 + " es multiplo de " + num1);
        } else {
            System.out.println(num2 + " no es multiplo de " + num1);
        }
    } 
}
