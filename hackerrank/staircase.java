package hackerrank;

import java.util.Scanner;

public class staircase {
    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN.
   Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1;i<=num;i++) {
            for(int j=i;j<num;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
