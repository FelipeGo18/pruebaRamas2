/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios2;

//O(casos)
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Tres {

    /**
     * @param args the command line arguments
     */
    public static int intervalo(int rating) {
        int divicion = 4;

        if (1900 <= rating) {
            divicion = 1;
        } else if (1600 <= rating && rating <= 1899) {
            divicion = 2;
        } else if (1400 <= rating && rating <= 1599) {
            divicion = 3;
        }
        return divicion;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < casos; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < casos; i++) {
            System.out.println("Division " + intervalo(a.get(i)));
        }

    }

}
