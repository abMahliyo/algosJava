package hackerrank;

import java.util.Scanner;

public class subarray_division {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] squares = new int[n];
        for(int i=0;i<n;i++) {
            squares[i]= scan.nextInt();
        }
        int count = 0;
        int d = scan.nextInt();
        int m = scan.nextInt();
        for(int i=0;i<n-m+1;i++) {
            long sum=squares[i];
            for(int j=i+1;j<n && j-i<m;j++) {
                sum+=squares[j];
            }
            if(sum==d) count++;
        }
        System.out.println(count);
    }
}
