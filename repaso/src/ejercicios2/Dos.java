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
public class Dos {

    /**
     * @param args the command line arguments
     */
    public static String suma(int a, int b, int c) {
        String suma = "NO";
        if (a + b == c) {
            suma = "YES";
        } else if (a + c == b) {
            suma = "YES";
        } else if (b + c == a) {
            suma = "YES";
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        for (int i = 0; i < casos; i++) {
            a.add(sc.nextInt());
            b.add(sc.nextInt());
            c.add(sc.nextInt());
        }

        for (int i = 0; i < casos; i++) {
            System.out.println(suma(a.get(i), b.get(i), c.get(i)));

        }

    }

}
