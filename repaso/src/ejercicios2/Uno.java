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
public class Uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // amigos
        int k = sc.nextInt();  // botellas
        int l = sc.nextInt();  // Mililitros botella
        int c = sc.nextInt();  // Limones
        int d = sc.nextInt();  // Rodajas de limón
        int p = sc.nextInt();  // Gramos de sal
        int nl = sc.nextInt(); // Mililitros necesarios por brindis
        int np = sc.nextInt(); // Gramos de sal necesarios por brindis

        int maxBebida = (k * l) / nl;
        int maxLimon = (c * d);
        int maxSal = p / np;

        int brindis = Math.min(maxBebida, Math.min(maxLimon, maxSal)) / n;
        System.out.println(brindis);

    }

}
