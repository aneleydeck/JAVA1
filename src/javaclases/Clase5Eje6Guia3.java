/*
 * TRealizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir 
del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.
1.suma 2. restar 3.multiplicacion 4.dividir 5 salir  elija una opcion

 */
package javaclases;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Clase5Eje6Guia3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1,num2,opc;
       String rta="S";
        System.out.println("Ingrese el primer numero entero");
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        num2=sc.nextInt();
        
        do {            
            System.out.println("Que operacion desea realizar?");
            System.out.println("1.SUMA");  
            System.out.println("2.RESTA");
            System.out.println("3.MULTIPLICACION");
            System.out.println("4.DIVISION");
            System.out.println("5.SALIR");
            opc= sc.nextInt();
              switch (opc) {
            case 1: System.out.println("La suma de los numeros es"+ (num1+num2));
                
                break;
                
            case 2: System.out.println("La resta de los numeros es"+(num1-num2));  
                break;
            case 3:  System.out.println("La multiplicacion es " + (num1*num2));
            
                break;
            case 4: System.out.println("La la division es "+ (num1/num2));  
                break;
            case 5: 
            System.out.println("¿Está seguro que desea salir del programa: seleccione (S/N)? ");
            rta= sc.next();
                break;
            
        
            default:
           
                System.out.println("Esa opcion no es correcta, ingrese una opcion entre 1 y 5");
        }
                
            
        } while (!rta.equals("S"));
        
      
        
    }
    
}
