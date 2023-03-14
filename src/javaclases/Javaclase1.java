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
public class Javaclase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        num1= leer.nextInt();
        num2= leer.nextInt();
        
        System.out.println("Los numeros ingresados son: " + num1 + " y " + num2);
        
        int suma= num1+num2;
        
        System.out.println("La suma de los dos numeros es " + suma);
        // TODO code application logic here
    }
    
}
