/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios1;

//O(n)
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gonza
 */

 
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */

     public static int division(int num1,int num2){
        if(num2==0){
            throw new ArithmeticException("No se puede dividir por 0");
        }
        return num1/num2;
     }

    public static int sumar(int num1, int num2) {

    System.out.println(num1 + " " + num2);

        int aux = 0;
        int suma = 0;
        int cont = 0;

        while ((num1 != 0) || (num2 != 0)) {
            suma = (num1 % 10) + (num2 % 10) + aux;
            num1 /= 10;
            num2 /= 10;

            if (suma >= 10) {
                aux = suma / 10;
                cont++;
            } else {
                aux = 0;
            }

        }

        return cont;

    }

    
    public static int multiplicacion(int a, int b){
        
        int c = a * b;
        
        return c;
    }

    public static void main(String[] args) {

        System.out.println(division(4,3 ));
        //Comentario de felipe
        
        System.out.println(multiplicacion(1,2));
        
        
    }

}
