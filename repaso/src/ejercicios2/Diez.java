/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios2;
//Dificultad o(nlogn)
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Diez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (char c : s.toCharArray()) {
            if (c != '+') {
                numeros.add(c - '0');
            }
        }
        
        Collections.sort(numeros);
        
        StringBuilder salida = new StringBuilder();
        for (int i = 0; i < numeros.size(); i++) {
            salida.append(numeros.get(i));
            if (i < numeros.size() - 1) {
                salida.append("+");
            }
        }
        
        System.out.println(salida.toString());
    }
    
}
