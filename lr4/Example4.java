package lr4;

public class Example4 {

    public static void main(String[] args) {

        int[][] triangle = createTriangleArray(5);
        printTriangle(triangle);
    }

    public static int[][] createTriangleArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = 1;
            }
        }
        return array;
    }

    public static void printTriangle(int[][] triangle) {
        for (int[] row : triangle) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
