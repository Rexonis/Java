package lr6;

public class Example7 {

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c'};
        int[] intArray = getCodes(charArray);

        for(int i : intArray) {
            System.out.print(i + " ");
        }
    }

    private static int[] getCodes(char[] charArray) {
        int[] codes = new int[charArray.length];
        for(int i = 0; i < charArray.length; i++) {
            codes[i] = charArray[i];
        }

        return codes;
    }
}

