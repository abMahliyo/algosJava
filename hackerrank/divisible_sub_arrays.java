package hackerrank;

import java.util.Scanner;

public class divisible_sub_arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if((arr[i]+arr[j])%p==0) { cnt++;}
            }
        }
        System.out.println(cnt);
    }
}
