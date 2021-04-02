package hackerrank;

import java.util.Scanner;

public class big_sum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long  sum = 0;
        while(n-- > 0) {
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }
}
