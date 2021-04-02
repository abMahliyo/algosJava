package codeforces;

import java.util.Scanner;

public class way_too_long_words_71A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String s[] = new String[num];
        for(int i=0;i<num;i++) {
            s[i] = scan.next();
        }
        for(int i=0;i<s.length;i++) {
            System.out.println(stringLen(s[i]));
        }
    }

    public static String stringLen(String str) {
        int len = str.length();
        return len > 10 ? str.charAt(0) + "" +
                String.valueOf(len - 2) + "" +
                str.charAt(len - 1) : str;
    }
}
