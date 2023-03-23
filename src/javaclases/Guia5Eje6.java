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
public class Guia5Eje6 {
    public static void main(String[] args){
    int[][] matriz = new int[3][3];
   // int[][] matriz={{2,7,6},{9,5,1},{4,3,8}};
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESA LOS DATOS");

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){
               
                do {
                   
                    System.out.println("ingresa numeros ente 1 y 9. Pos "+ i+ "--" + j);
                  matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] > 9 || matriz[i][j]<1);

                

            }
        }
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
        
        
        int[] vectorFila= new int [3];
        int[] vectorColumna= new int[3];
        int diag1 = 0 ;
        int diag2 = 0;
        int sumaFila;
        int sumaColumna;
        
        for (int i=0; i< 3; i++){
            sumaFila=0;
            sumaColumna=0;
            for (int j=0; j< 3; j++){
               
                sumaFila =  sumaFila + matriz[i][j]; /*+matriz[0][0]+matriz[0][2];*/
                sumaColumna = sumaColumna + matriz[j][i];
                if (i==j) {
                 diag1= diag1 + matriz[i][j];
                 
                    
                }
                if (i+j==2) {
                diag2+= matriz[i][j]; // esto es igual a diag2= diag2 + matriz[i][j]
                    
                }
            
                }
            vectorFila[i] = sumaFila;
            vectorColumna[i] = sumaColumna;
            
            System.out.println("suma columnas "+ vectorColumna[i]);
            
            }
            System.out.println("Diag 1 : "+ diag1);
            System.out.println("Diag 2 :" + diag2);   
           boolean magica= true;
           for (int i = 0; i < 3; i++) {
            System.out.println("suma fila N°" + i + " es " + vectorFila[i]);
               if (diag1!= vectorFila[i] || diag1!= vectorColumna[i]|| diag1!= diag2) {
                  magica=false;
               }
                   
               }
             System.out.println("la matriz es magica?  " + magica);
        }
            
        }
       


    




