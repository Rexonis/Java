package lr6;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество вызовов статического метода:");
        int numberOfInvocations = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < numberOfInvocations; i++) {
            Counter.incrementAndDisplay();

        }

    }
}

class Counter {
    private static int counter = 0;

    private Counter() {}

    public static void incrementAndDisplay() {
        System.out.println(counter++);
    }
}
