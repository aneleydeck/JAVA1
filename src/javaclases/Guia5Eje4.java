/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
   la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando   
   sus filas por columnas (o viceversa) 
 */
package javaclases;

/**
 *
 * @author usuario
 */
public class Guia5Eje4 {
     public static void main(String[] args){
        
    int [][] matriz = new int[4][4];
    int [][] matrizTranspuesta = new int[4][4];
    
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matriz[i][j] =(int)(Math.random()*100);
                    
                }
            
     }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("["+ matriz[i][j] + "]");
                    
                }
             System.out.println("");    
         }
           
 
            
       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizTranspuesta[i][j] = matriz[j][i];
                
            }
        }
        System.out.println("Matriz transpuesta");  
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+ matrizTranspuesta[i][j]+ "]");
                
            }
            System.out.println("");
            
        }
 
    }
   }
    

