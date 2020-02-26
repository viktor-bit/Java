/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skaciu.seka;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class SkaciuSeka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("skaicius Nr.1");
        long sk1 = sc.nextLong();
        while (sk1 < 0) {
            System.out.println("skacius Nr.1 negali buti neigiamas");
            sk1 = sc.nextLong();
        }
        System.out.println("skaicius Nr.2");
        long sk2 = sc.nextLong();
        while (sk2 <= 0) {
            System.out.println("skacius Nr.2 negali buti neigiamas arba 0");
            sk2 = sc.nextLong();
        }
        System.out.println("maksimalus skaicius");
        long maxSkaicius = sc.nextLong();
        while (maxSkaicius <= 0) {
            System.out.println("maxSkacius negali buti 0 arba neigiamas ");
            maxSkaicius = sc.nextInt();
        }
        System.out.println("--------------------------------");
        while (sk2 <= maxSkaicius) {
            long f = sk1;
            System.out.println("skaicius Fibonacci = " + f + "     skacius f = " + ((float) sk2 / sk1));
            f = sk2 + sk1;
            sk1 = sk2;
            sk2 = f;
        }
        System.out.println("-------------------------------");
        System.out.println("Fibonacci siekos iki  " + maxSkaicius + " pabaiga");

    }
}
