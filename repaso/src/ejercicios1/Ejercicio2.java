/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios1;

//O(n)
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static int sumar(int num1, int num2) {

    System.out.println(num1 + " " + num2);

        int aux = 0;
        int suma = 0;
        int cont = 0;

        while ((num1 != 0) || (num2 != 0)) {
            suma = (num1 % 10) + (num2 % 10) + aux;
            num1 /= 10;
            num2 /= 10;

            if (suma >= 10) {
                aux = suma / 10;
                cont++;
            } else {
                aux = 0;
            }

        }

        return cont;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        while (true) {

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if ((num1 == 0) && num2 == 0) {
                break;
            }

            lista1.add(num1);
            lista2.add(num2);

        }

        for (int i = 0; i < lista1.size(); i++) {
            if (sumar(lista1.get(i), lista2.get(i)) == 0) {
                System.out.println("No carry operation.");
            } else if (sumar(lista1.get(i), lista2.get(i)) == 1) {
                System.out.println(sumar(lista1.get(i), lista2.get(i)) + " carry operation.");
            } else {
                System.out.println(sumar(lista1.get(i), lista2.get(i)) + " carry operations.");
            }
        }

    }


}
