package lr3;

public class Example8 {

    public static void main(String[] args) {

        char[] array = new char[10];
        char letter = 'A';

        for (int i = 0; i < 10; i++) {
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                letter++;
            }
            array[i] = letter;
            letter++;
        }

        for (char value : array) {
            System.out.print(value + " ");
        }
    }
}
