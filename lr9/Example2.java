package lr9;
import java.util.Scanner;

public class Example2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            int decimalNumber = scanner.nextInt();
            scanner.close();

            String binaryNumber = convertToBinary(decimalNumber);
            System.out.println("Двоичное представление числа: " + binaryNumber);
        }

        public static String convertToBinary(int decimalNumber) {
            if (decimalNumber == 0) {
                return "0";
            } else if (decimalNumber == 1) {
                return "1";
            } else {
                int remainder = decimalNumber % 2;
                int quotient = decimalNumber / 2;
                return convertToBinary(quotient) + remainder;
            }
        }
}

