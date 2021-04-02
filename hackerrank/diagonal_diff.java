package hackerrank;

import javax.management.Query;
import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

public class diagonal_diff {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int d1=0, d2=0;
        for(int i=0;i<n;i++)
        {
            d1 += arr[i][i];
            d2 += arr[i][n-i-1];
        }
        System.out.println(Math.abs(d1-d2));

    }
}
