package timus_2sem;

import java.io.*;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Bayani1563 {

    public static void main(String[] args) throws IOException {
        Set<String> str_set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String temp_str;
        for (int i = 0; i < n; ++i) {
            temp_str = scanner.nextLine();
            str_set.add(temp_str);
        }
        System.out.println("\n" + (n - str_set.size()));
    }
}
