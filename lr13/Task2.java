package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix;
        int columnIndex;

        try {
            System.out.print("Введите количество строк матрицы: ");
            int rows = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            System.out.print("Введите количество столбцов матрицы: ");
            int columns = scanner.nextInt();
            scanner.nextLine();

            matrix = new int[rows][columns];

            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.print("Введите номер столбца для вывода: ");
            columnIndex = scanner.nextInt();
            scanner.nextLine();

            if (columnIndex < 0 || columnIndex >= columns) {
                throw new IllegalArgumentException("Нет столбца с номером " + columnIndex);
            }

            System.out.println("Элементы столбца " + columnIndex + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][columnIndex]);
            }
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
