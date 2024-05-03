package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] array;
        long sum = 0;

        try {
            System.out.print("Введите количество элементов массива: ");
            int size = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            array = new byte[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextByte();
            }

            for (byte num : array) {
                sum += num;
            }

            System.out.println("Сумма элементов массива: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено не число");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Значение за пределами диапазона типа byte");
        } catch (Exception e) {
            System.out.println("Произошла неизвестная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
