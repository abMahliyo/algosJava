package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class mini_max_sum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long[] array = new long[5];
        for(int i=0;i<5;i++) {
            array[i] = scan.nextInt();
        }

        Arrays.sort(array);
        long sum = 0;
        for (int i=0;i<5;i++) {
            sum+=array[i];
        }
        System.out.println(sum-array[4]+ " " + (sum-array[0]));
    }
}
