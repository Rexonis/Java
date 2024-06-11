package timus_2sem;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Demokrat1025 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n, bb;
        n = scanner.nextInt();
        Vector<Integer> a = new Vector<>();
        int k = 0;
        for (int i = 0; i < n; ++i) {
            bb = scanner.nextInt();
            a.add(bb);
        }
        java.util.Collections.sort(a);
        for (int i = 0; i <= a.size() / 2; ++i) {
            k += (a.get(i) / 2) + 1;
        }
        System.out.println(k);
    }
}
