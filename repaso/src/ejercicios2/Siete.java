/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios2;
//dificultad O(nlogn) + O(casos)
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Siete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();


        while (casos-- > 0) {
            int n = sc.nextInt();
                    int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int salida = -1;
            for (int i = 0; i < n - 2; i++) {
                if (a[i] == a[i + 1] && a[i] == a[i + 2]) {
                    salida = a[i];
                    break;
                }
            }

            System.out.println(salida);
        }
    }

}
