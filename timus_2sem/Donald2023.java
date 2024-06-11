package timus_2sem;

import java.io.*;
import java.util.Scanner;

public class Donald2023 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n, s = 0;
        String b;
        n = scanner.nextInt();
        int pos = 1;
        for (int i = 0; i < n; ++i) {
            b = scanner.next();
            if (b.charAt(0) == 'A' || b.charAt(0) == 'P' || b.charAt(0) == 'O' || b.charAt(0) == 'R') {
                s += Math.abs(pos - 1);
                pos = 1;
            } else if (b.charAt(0) == 'B' || b.charAt(0) == 'M' || b.charAt(0) == 'O' || b.charAt(0) == 'S') {
                s += Math.abs(pos - 2);
                pos = 2;
            } else {
                s += Math.abs(pos - 3);
                pos = 3;
            }
        }
        System.out.println(s);
    }
}
