/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricos.determinantas2;

/**
 *
 * @author Dell
 */
public class MatricosDeterminantas2 {

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
            {4, 5, 6},
            {7, 8, 9}
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
            {1, 2, 3, 4, 5,6},
            {2, 1, 2, 3, 4,7},
            {3, 2, 1, 2, 3,8},
            {4, 3, 2, 1, 2,9},
            {11,12,13,14,15,16,},
            {5, 4, 3, 2, 1,10}
        };

        int[][] matrica = m6;
        spM2(matrica);

        switch (matrica.length) {
            case 2:
                System.out.println("matricos determinantas = " + det2(matrica));
                break;
            case 3:
                System.out.println("matricos determinantas = " + det3(matrica));
                break;
            case 4:
                System.out.println("matricos determinantas = " + det4(matrica));
                break;
            case 5:
                System.out.println("matricos determinantas = " + det5(matrica));
                break;
            case 6:
                System.out.println("matricos determinantas = " + det6(matrica));
                break;
        }
    }

    public static int det2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static int det3(int[][] m) {
              int sum=0;
         for(int i=0;i<m.length;i++){
           if(i%2==0) {
               sum+=m[0][i]*det2(mF(m,i));
           } else{
               sum-=m[0][i]*det2(mF(m,i));
           }
         }
         
        return sum;
    }

    public static int det4(int[][] m) {
                       int sum=0;
         for(int i=0;i<m.length;i++){
           if(i%2==0) {
               sum+=m[0][i]*det3(mF(m,i));
           } else{
               sum-=m[0][i]*det3(mF(m,i));
           }
         }
         
        return sum;
    }
 
    public static int det5(int[][] m) {
                  int sum=0;
         for(int i=0;i<m.length;i++){
           if(i%2==0) {
               sum+=m[0][i]*det4(mF(m,i));
           } else{
               sum-=m[0][i]*det4(mF(m,i));
           }
         }
         
        return sum;
    }
     public static int det6(int[][] m) {
                  int sum=0;
         for(int i=0;i<m.length;i++){
           if(i%2==0) {
               sum+=m[0][i]*det5(mF(m,i));
           } else{
               sum-=m[0][i]*det5(mF(m,i));
           }
         }
         
        return sum;
    }
   
    

    public static int[][] mF(int[][] m, int nr) {
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

    public static void spM2(int[][] mtr) {
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
