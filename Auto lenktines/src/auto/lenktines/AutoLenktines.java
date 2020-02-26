/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.lenktines;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class AutoLenktines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        //                       automobiliu lenktines

        System.out.println();
        System.out.println("automobiliiu lenktines");
        System.out.println();
        System.out.print("Iveskite distancijos ilgi :");
        int maxKm = sc.nextInt();
        while (maxKm <= 0) {
            System.out.println("Distancija negali buti 0 arba neigiama ");
            System.out.print("Iveskite distancijos ilgi :");
            maxKm = sc.nextInt();
        }
        char[] mt = {'A', 'B', 'C', 'P', 'F', 'K'};
        double[] ma = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        int cc = 0;
        while (ma[0] < maxKm) {
            cc++;

            for (int j = 0; j < ma.length; j++) {
                double maa = (Math.random() * 10);
                ma[j] += maa;
            }
            if (cc == 1) {
                System.out.println("Pradinis massivas");
                masPrinting(ma, mt);
            }
            System.out.println("----  " + cc + "  ratas  -------");
            int i2 = 1;
            double ma2 = 0;
            char mt2;
            while (i2 > 0) {
                i2 = 0;
                for (int i = 0; i < ma.length - 1; i++) {
                    if (ma[i] < ma[i + 1]) {
                        ma2 = ma[i];
                        ma[i] = ma[i + 1];
                        ma[i + 1] = ma2;
                        mt2 = mt[i];
                        mt[i] = mt[i + 1];
                        mt[i + 1] = mt2;
                        i2++;
                    }
                }
            }
            masPrinting(ma, mt);
            System.out.println("-----------------------");
        }
    }

    public static void masPrinting(double[] ma, char[] mt) {
        for (int i = 0; i < ma.length; i++) {
            System.out.printf("%c  %.2f   \n", mt[i], ma[i]);
        }
        System.out.println();
    }
}
