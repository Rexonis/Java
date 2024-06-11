package timus_2sem;

import java.io.*;
import java.util.Scanner;

public class PsychUp1880 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int co1 = scanner.nextInt();
        int[] nm1 = new int[co1];
        for (int i = 0; i < co1; i++) {
            nm1[i] = scanner.nextInt();
        }
        int co2 = scanner.nextInt();
        int[] nm2 = new int[co2];
        for (int i = 0; i < co2; i++) {
            nm2[i] = scanner.nextInt();
        }
        int co3 = scanner.nextInt();
        int[] nm3 = new int[co3];
        for (int i = 0; i < co3; i++) {
            nm3[i] = scanner.nextInt();
        }
        int c = 0;

        for (int i = 0; i < co1; i++) {
            for (int k = 0; k < co2; k++) {
                if (nm1[i] == nm2[k]) {
                    for (int j = 0; j < co3; j++) {
                        if (nm2[k] == nm3[j]) {
                            c++;
                            break;
                        }
                    }
                    break;
                }
            }
        }

        System.out.println(c);
    }
}
