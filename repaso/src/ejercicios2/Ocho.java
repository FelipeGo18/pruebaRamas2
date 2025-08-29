/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios2;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ocho {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        
        while (casos-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            int operaciones = 0;
            
            while (a <= n && b <= n) {
                if (a < b) {
                    a += b;
                } else {
                    b += a;
                }
                operaciones++;
            }
            
            System.out.println(operaciones);
        }
        
    }
}
