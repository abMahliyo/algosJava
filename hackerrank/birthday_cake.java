package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class birthday_cake {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++) {
            array[i] = scan.nextInt();
        }
        int count = 0;
        Arrays.sort(array);
        for (int i = 0;i<n;i++) {
            if(array[n-1]== array[i]) {
                count++;
            }
        }
        System.out.println(count);

    }
}
