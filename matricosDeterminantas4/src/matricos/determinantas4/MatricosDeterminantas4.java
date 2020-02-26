/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricos.determinantas4;

/**
 *
 * @author Dell
 */
public class MatricosDeterminantas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] m1 = {5};
        int[][] m2 = {
            {1, 2},
            {3, 4}
        };

        int[][] m3 = {
            {1, 2, 3},
            {4, 1, 6},
            {7, 8, 1}
        };
        int[][] m4 = {
            {1, 2, 3, 16},
            {5, 1, 7, 8},
            {5, 10, 1, 12},
            {13, 14, 15, 1}
        };
        int[][] m5 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        int[][] m51 = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 4},
            {3, 2, 1, 2, 3},
            {4, 3, 2, 1, 2},
            {5, 4, 3, 2, 1}
        };
        int[][] m6 = {
            {1, 2, 3, 4, 5, 6},
            {2, 1, 2, 3, 4, 7},
            {3, 2, 1, 2, 3, 8},
            {4, 3, 2, 1, 2, 9},
            {11, 12, 13, 14, 15, 16,},
            {5, 4, 3, 2, 1, 10}
        };
         int[][]m12 = {
             {1,1,2,2,3,3,4,4,5,5,6,6},
             {3,3,3,5,5,5,6,6,6,7,7,7},
             {0,4,5,3,5,6,7,3,2,5,6,7},
             {1,1,2,2,3,3,4,4,5,5,6,6},
             {3,3,3,5,5,5,6,6,6,7,7,7},
             {0,4,5,3,5,6,7,3,2,5,6,7},
             {9,8,5,3,5,7,5,2,5,7,9,4},
             {0,4,5,3,5,6,7,3,2,5,6,7},
             {1,1,2,2,3,3,4,4,5,5,6,6},
             {0,4,5,3,5,6,7,3,2,5,6,7},
             {1,1,2,2,3,3,4,4,5,5,6,6},
             {3,3,3,5,5,5,6,6,6,7,7,7}
         };
        int[][] matrica = m12;
        printingM2(matrica);
        System.out.println("--------------------------------");
        System.out.println("matricos determinantas = " + det(matrica));
    }
//        determinanto skaiciavimas

    public static int det(int[][] m) {
        int sum = 0;
        if (m.length == 2) {
            sum = sum + m[0][0] * m[1][1] - m[0][1] * m[1][0];
            return sum;
        }
        for (int i = 0; i < m.length; i++) {
//            sum+=((i%2==0)?1:-1) * m[0][i] * det(matricuFormavimas(m, i));
            if (i % 2 == 0) {
                sum += m[0][i] * det(matricuFormavimas(m, i));
            } else {
                sum -= m[0][i] * det(matricuFormavimas(m, i));
            }
        }
        return sum;
    }
//              matricu formavimas

    public static int[][] matricuFormavimas(int[][] m, int nr) {
        int[][] mx = new int[m.length - 1][m.length - 1];
        int ii = -1;
        for (int i = 0; i < m.length; i++) {
            ii++;
            if (i == nr) {
                if (i == m.length - 1) {
                    continue;
                } else {
                    i++;
                }
            }
            for (int j = 0; j < m.length - 1; j++) {
                mx[j][ii] = m[j + 1][i];
            }
        }
        return mx;
    }
//        matricos spausdinimas

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
