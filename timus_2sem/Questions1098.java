package timus_2sem;

import java.io.*;
import java.util.Scanner;

public class Questions1098 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        int pos = 0, n = 1998;
        while (s.length() > 1) {
            pos += n;
            pos %= s.length();
            s = s.substring(0, pos) + s.substring(pos + 1);
        }
        if (s.charAt(0) == '?') {
            System.out.println("Yes");
        } else if (s.charAt(0) == ' ') {
            System.out.println("No");
        } else {
            System.out.println("No comments");
        }
    }
}
