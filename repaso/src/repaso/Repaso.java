/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

/**
 *
 * @author gonza
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int cont = 0;
        int N = 2;
        int suma = 0;

        ArrayList<Integer> p = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros perfectos: ");
        n = sc.nextInt();

        while (cont != n) {
            int ultimoDigito = N % 10;
            if (ultimoDigito == 6 || ultimoDigito == 8) {
                System.out.println(N);
                for (int i = 1; i < N/2; i++) {
                    if (N % i == 0) {
                        suma += i;

                    }

                }

                if (suma == N) {
                    p.add(N);
                    cont++;

                }

            }
            suma = 0;
            N++;
        }

        System.out.println(p);
    }

}
