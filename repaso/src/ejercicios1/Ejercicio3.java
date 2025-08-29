/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios1;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
     public static int longitudCiclo(int n) {
        int longitud = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            longitud++;
        }
        return longitud;
    }

    public static int maxLongitudCiclo(int i, int j) {
        int inicio = Math.min(i, j);
        int end = Math.max(i, j);
        int maxLongitud = 0;
        for (int n = inicio; n <= end; n++) {
            maxLongitud = Math.max(maxLongitud, longitudCiclo(n));
        }
        return maxLongitud;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(i + " " + j + " " + maxLongitudCiclo(i, j));
        }
    }
    
}
