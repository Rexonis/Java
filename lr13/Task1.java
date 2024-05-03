package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers;
        int positiveCount = 0;
        int positiveSum = 0;
        double average;

        try {
            System.out.print("Введите количество элементов массива: ");
            int size = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            numbers = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                int num = scanner.nextInt();
                if (num < 0) {
                    throw new IllegalArgumentException("Введено отрицательное число: " + num);
                }
                numbers[i] = num;
            }

            for (int num : numbers) {
                if (num > 0) {
                    positiveSum += num;
                    positiveCount++;
                }
            }

            if (positiveCount == 0) {
                throw new IllegalArgumentException("Положительные элементы отсутствуют");
            }

            average = (double) positiveSum / positiveCount;
            System.out.printf("Среднее значение положительных элементов: %.2f%n", average);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено не число");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла неизвестная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
