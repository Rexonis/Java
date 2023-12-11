package lr4;

public class Example1 {

    public static void main(String[] args) {

        int width = 23;
        int height = 11;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || i == 0 || j == width - 1 || i == height - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
