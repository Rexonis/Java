package lr4;

public class Example2 {

    public static void main(String[] args) {

        int rows = 10;
        int cols = 10;
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < cols) {
                if (j <= i) {
                    System.out.print("*"); j++;
                }
            }
            System.out.println(); i++;
        }
    }
}

