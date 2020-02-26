/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricu.daugyba;

/**
 *
 * @author Dell
 */
public class MatricuDaugyba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] a = {
            {2, 3, 4},
            {1, 2, 4}
        };
        int[][] b = {
            {1, 3},
            {2, 5},
            {3, 1}
        };
        if (a[0].length == b.length) {
            int[][] c = new int[a.length][b[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int s = 0; s < a[0].length; s++) {
                        c[i][j] +=a[i][s] * b[s][j];
                    }
                }
            }
            printingM2(c);
        } else {
            System.out.println("matricos turi buti suderintos ");
        }
    }
//            matricos spausdinimas
    public static void printingM2(int[][] mtr) {
        for (int i = 0; i < mtr.length; i++) {
            for (int j = 0; j < mtr[i].length; j++) {
                if (mtr[i][j] < 10) {
                    System.out.print(mtr[i][j] + "  ");
                } else {
                    System.out.print(mtr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
