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
public class Clase6Eje8Guia3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        int num= sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i==0 || i == num-1){
                    System.out.print("*"); //System.out.print es SIN SALTO DE LINEA System.out.println es CON SALTO DE LINEA
                } else if(j==0 || j==num-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
            
        }
    }
    
}
