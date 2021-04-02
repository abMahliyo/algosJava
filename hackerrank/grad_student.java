package hackerrank;

import java.util.Scanner;

public class grad_student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++) {
            array[i]= scan.nextInt();
            if(array[i] >= 38) {
                if(array[i]%5>=3) {
                   array[i]+=5-(array[i]%5);
                }
            }
            System.out.println(array[i]);
        }


    }
}
