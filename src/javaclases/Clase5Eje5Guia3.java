/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y
a continuación solicite números al usuario hasta que la suma de los numeros 
introducidos supere el límite inicial
 */
package javaclases;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Clase5Eje5Guia3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int limite, suma, num;
        
        System.out.println("Ingrese un numero limite");
        limite = sc.nextInt();
        suma=0;
        
        for (int i = 1; i <= limite; i++) {
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            suma= suma+ num;
            
        }
        System.out.println("La suma es "+ suma);
        
    }
    
}
