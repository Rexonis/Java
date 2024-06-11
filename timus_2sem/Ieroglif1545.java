package timus_2sem;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Ieroglif1545 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char t = scanner.next().charAt(0);
        Vector<String> s = new Vector<>();
        for (int i = 0; i < n; ++i) {
            s.add(scanner.next());
        }
        for (int i = 0; i < s.size(); ++i) {
            if (s.get(i).charAt(0) == t) {
                System.out.println(s.get(i));
            }
        }
    }
}
