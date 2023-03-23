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
public class Clase10Guia5teoria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        int cantidad = 5;
        int i;
        String[] equipo = new String[11];
        
        for (i=0; i< 5; i++){
            System.out.println("Ingrese un nombre");
            
            equipo[i]= sc.nextLine();
            
           
            
        }
        for (i=0; i< 5; i++){
           
        System.out.print("[" + equipo[i] + "]");
        
        
        }
    
    }
}
    
    

