package hackerrank;

import java.util.Scanner;

public class time_conversion {

    public static void main(String[] args) {
        String time = new Scanner(System.in).nextLine();
        if(time.substring(8).equals("PM")) {
            if(time.substring(0, 2).equals("12"))
                System.out.println(time.substring(0,8));
            else
                System.out.println(((Integer.parseInt(time.substring(0,2)) + 12) % 24) + time.substring(2, 8));
        } else
            if(time.substring(0,2).equals("12"))
                System.out.println("00" + time.substring(2,8));
            else
                System.out.println(time.substring(0,8));
    }
}
