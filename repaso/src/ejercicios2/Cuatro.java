/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Cuatro {

    /**
     * @param args the command line arguments
     */
    public static String operacion(int a, int b, int c) {
        String operacion = "";
        
        if (a + b == c) {
            operacion = "+";
        } else if (a - b == c) {
            operacion = "-";
        }

        return operacion;
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
            System.out.println(operacion(a.get(i), b.get(i), c.get(i)));

        }
        
        while(casos < 0)
            casos/=2;
    }
    
}
