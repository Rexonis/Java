package lr6;

public class Example3 {

    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 8, 12};

        // Вызов методов
        System.out.println("Максимальное значение: " + maxValue(arr));
        System.out.println("Минимальное значение: " + minValue(arr));
        System.out.println("Среднее значение: " + averageValue(arr));
    }

    private static int maxValue(int... args) {
        if (args.length == 0) {
            return 0;
        }
        int max = args[0];
        for (int i = 1; i < args.length; i++) {
            if (max < args[i]) {
                max = args[i];
            }
        }
        return max;
    }

    private static int minValue(int... args) {
        if (args.length == 0) {
            return Integer.MAX_VALUE;
        }

        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;
    }

    private static double averageValue(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }
}




