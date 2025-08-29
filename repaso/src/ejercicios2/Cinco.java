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
public class Cinco {

    /**
     * @param args the command line arguments
     */
    //dificultad 0(casos*numDulces)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        while (casos-- > 0) {
            int numDulces = sc.nextInt();
            int sum = 0;
            int cont1 = 0;
            int cont2 = 0;

            for (int i = 0; i < numDulces; i++) {
                int pesos = sc.nextInt();
                sum += pesos;
                if (pesos == 1) {
                    cont1++;
                } else {
                    cont2++;
                }
            }

            if (sum % 2 != 0) {
                System.out.println("NO");
            } 
            else if (cont1 == 0 && (cont2 % 2 != 0)) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }

    }

}
