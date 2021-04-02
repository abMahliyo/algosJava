package codeforces;

import java.util.Scanner;

public class theatre_square_1A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();

        System.out.println((long)((m+a-1)/a)*((n+a-1)/a));

    }
}
