package timus_2sem;

import java.io.*;
import java.util.Scanner;

public class Pingvin1585 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n, k3, k1, k2;
        k1 = k2 = k3 = 0;
        String s, s1;
        n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            s = scanner.next();
            s1 = scanner.next();
            if (s.equals("Emperor")) {
                ++k1;
            } else if (s.equals("Little")) {
                ++k2;
            } else {
                ++k3;
            }
        }
        if (k1 > k2 && k1 > k3) {
            System.out.println("Emperor Penguin");
        } else if (k2 > k1 && k2 > k3) {
            System.out.println("Little Penguin");
        } else if (k3 > k1 && k3 > k2) {
            System.out.println("Macaroni Penguin");
        }
    }
}
