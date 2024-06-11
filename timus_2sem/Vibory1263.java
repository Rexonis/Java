package timus_2sem;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Vibory1263 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n, m, t;
        n = scanner.nextInt();
        m = scanner.nextInt();
        Vector<Integer> a = new Vector<>();
        for (int i = 0; i < m; ++i) {
            t = scanner.nextInt();
            a.add(t - 1);
        }
        for (int i = 0; i < a.size(); ++i) {
            double result = ((double) a.get(i) * 100) / m;
            System.out.println(String.format("%.2f", result) + "%");
        }
    }
}
