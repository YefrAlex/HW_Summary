package JavaSummary._2023_08_18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] n = {100, 112, 256, 349, 770};
        int[] m = {72,86,113,119,265,445,892};
        int k = 7;

        System.out.println(findElement(n,m,k));
    }
    static int findElement (int[] n, int[] m, int k){
        int[] nm = new int [m.length + n.length];
        for (int i=0, j=0, l=0; i < nm.length ; i++) {
            if (n[j]<=m[l]){
                nm[i]=n[j];
                if (j==n.length-1){
                    n[j] = Integer.MAX_VALUE;
                } else {
                    j++;}
            } else {
                nm[i]=m[l];
                if (l==m.length-1){
                    m[l] = Integer.MAX_VALUE;
                } else {
                    l++;}
            }

        }
        return nm[k];
    }

}
