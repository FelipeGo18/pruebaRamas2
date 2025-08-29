/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios2;
//Dificultad O(n)
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Nueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nombre = sc.next();
        
        int salida = 0;
        
        for (int i = 0; i <= n - 3; i++) {
            if (nombre.charAt(i) == 'x' && nombre.charAt(i + 1) == 'x' && nombre.charAt(i + 2) == 'x') {
                salida++;
            }
        }
        
        System.out.println(salida);
    }
    
}
