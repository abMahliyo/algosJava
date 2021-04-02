package hackerrank;

import java.util.Scanner;

public class plus_minus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float s = n;
        int[] arr = new int[n];
        int c1=0, c2=0, c3=0;
        for(int i=0;i<n;i++) {
            arr[i]= scan.nextInt();
            if(arr[i]==0) { c1++;}
            else if(arr[i]>0) {c2++;}
            else c3++;
        }
        System.out.printf("%.3f\n%.3f\n%.3f\n", c2/s,c3/s,c1/s);


    }
}
