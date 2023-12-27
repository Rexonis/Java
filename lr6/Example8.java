package lr6;

public class Example8 {
    public static void main(String[] args) {
            int[] array = {2, 4, 6, 8, 10};
            System.out.println(averageValue(array));
    }
        public static double averageValue(int[] array) {
            double sum = 0;

            for (int element : array) {
                sum += element;
            }

            return sum / array.length;
        }
}


