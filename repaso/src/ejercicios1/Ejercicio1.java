/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios1;

//complejidad O(n^2)
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio1 {

    public static long rotarNumero(long num) {
        long numeroRotado = 0;
        long aux;

        while (num != 0) {
            aux = num % 10;
            numeroRotado = numeroRotado + aux;
            num /= 10;
            if (num != 0) {
                numeroRotado *= 10;
            }

        }

        return numeroRotado;

    }

    public static boolean esPalindromo(long num) {
        if (rotarNumero(num) == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        long num;
        int casos;
        int list[];
        long output[];
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        //System.out.println("Ingrese entre 1 y 99 numeros de caso:  ");
        casos = sc.nextInt();

        list = new int[casos];
        output = new long[casos];

        for (int i = 1; i <= casos; i++) {
            //System.out.print("Ingrese el caso " + i + ": ");
            list[i - 1] = sc.nextInt();
        }

        for (int i = 0; i < casos; i++) {
            num = list[i];

            while (!esPalindromo(num)) {
                num = num + rotarNumero(num);
                cont++;
            }

            output[i] = num;

            System.out.println(cont + " " + output[i]);
            cont = 0;
        }

    }

}
