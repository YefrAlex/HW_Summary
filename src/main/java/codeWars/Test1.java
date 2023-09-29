package codeWars;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        int[] n={100, 112, 256, 349, 770};
        int[] m={72, 86, 113, 119, 265, 445, 892};
        int k=7;

        System.out.println(findElement(n, m, k));
    }

    static int findElement(int[] n, int[] m, int k) {
        int[] nm=new int[m.length + n.length];
        for (int i=0, j=0, l=0; i < nm.length; i++) {
            if (n[j] <= m[l]) {
                nm[i]=n[j];
                if (j == n.length - 1) {
                    n[j]=Integer.MAX_VALUE;
                } else {
                    j++;
                }
            } else {
                nm[i]=m[l];
                if (l == m.length - 1) {
                    m[l]=Integer.MAX_VALUE;
                } else {
                    l++;
                }
            }

        }
        return nm[k-1];
    }
}


/*
public class Main {
    public static int progression(int n,int k) {
        if (n<=0 || k<=0) throw new ArithmeticException("The number can't be non-positive");
        if (n==1) return 1;
        return progression(n-1,k)+1+(n-1)*k;
    }

    public static void main(String[] args) {
        System.out.println(progression(5,1));

    }
}
 */

