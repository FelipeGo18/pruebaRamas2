/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios1;

//dificultad 0(casos)
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Seis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        while (casos-- > 0) {
            String a = sc.next();
            int suma = Integer.parseInt(String.valueOf(a.charAt(0))) + 
                       Integer.parseInt(String.valueOf(a.charAt(2)));
            System.out.println(suma);
        }
    }

}
