package lr6;

public class Example9 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        swapPairs(array);
        for (char c : array) {
            System.out.print(c + " ");
        }
    }

    public static void swapPairs(char[] array) {
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }
    }
}
