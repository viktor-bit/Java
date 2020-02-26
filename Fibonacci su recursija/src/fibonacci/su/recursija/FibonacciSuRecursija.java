/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.su.recursija;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class FibonacciSuRecursija {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        
        
        //           Fibonacci skaiciu skaiciavimas su recursija

        System.out.println("Fibonacci skaiciu skaiciavimas su recursija");
        System.out.println();
        System.out.print("Iveskite skaiciu nr1:");
        int sk1 = sc.nextInt();
        while (sk1 < 0) {
            System.out.println("Skaicius turi buti teigiamas");
            System.out.print("Iveskite skaiciu nr1:");
            sk1 = sc.nextInt();
        }
        System.out.print("Iveskite skaiciu nr.2:");
        int sk2 = sc.nextInt();
        while (sk2 < sk1) {
            System.out.println("skaicius nr.2 turi buti didesnis uz skaiciu nr.1 ");
            System.out.print("Iveskite skaiciu nr.2:");
            sk2 = sc.nextInt();
        }

        System.out.print("Iveskite maksimalu skaiciu :");
        int maxSkaicius = sc.nextInt();
        while (maxSkaicius <= 0) {
            System.out.println("maxSkacius negali buti 0 arba neigiamas ");
            System.out.print("maksimalus skaicius :");
            maxSkaicius = sc.nextInt();
        }
        System.out.println("--------------------------------");
        System.out.print(sk1 + " " + sk2 + " ");

        fibonacciRecursion(sk1, sk2, maxSkaicius);

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Fibonacci siekos iki  " + maxSkaicius + " pabaiga");
        
        
    }
      public static void fibonacciRecursion(int sk1, int sk2, int maxSk) {
        int skit = sk2;
        sk2 += sk1;
        sk1 = skit;
        if (sk2 <= maxSk) {
            System.out.print(sk2 + " ");
            fibonacciRecursion(sk1, sk2, maxSk);
        }
    }
    
}
