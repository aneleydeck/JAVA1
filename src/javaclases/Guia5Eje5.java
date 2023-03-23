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
public class Guia5Eje5 {
  public static void main(String[]args){
      
    int[][] matriz = new int[3][3];
    int[][] matrizTranspuesta = new int[3][3];
    boolean esAntisimetrica = true;
    Scanner leer = new Scanner(System.in);
    
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.println("Ingrese el valor en el renglon"+ i + ", columna " + j);
                  matriz[i][j]= leer.nextInt();
              }         
      }
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 System.out.println("["+ matriz[i][j]+"]");
                 
             }
             System.out.print("");
          
      }
         System.out.println("-----------------------");
       
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 matrizTranspuesta[i][j] = matriz[j][i];
                 
             }
          
      }
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 System.out.print("[" + matrizTranspuesta[i][j] + "]");
                 
             }
             System.out.println("");
          
      }
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               if (matriz[i][j] != -1*matrizTranspuesta[i][j]) { // O matriz[i][j] == -1*matriz[j][i]
                  
                   esAntisimetrica = false;
                   
               }
             
               
           }
          
      }
       
          if(esAntisimetrica == false){
              System.out.println("No es Antisimetrica");
          }
          else{
              System.out.println("SI es antisimetrica");
          }
          
            
    }
    
}
