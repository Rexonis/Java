package lr11;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example6 {
        public static List<Integer> filterDivisible(List<Integer> inputList, int divisor) {
            List<Integer> filteredList = new ArrayList<>();

            // Проходим по каждому числу в списке
            for (int num : inputList) {
                // Проверяем, делится ли число на заданный делитель без остатка
                if (num % divisor == 0) {
                    // Если делится, добавляем число в новый список
                    filteredList.add(num);
                }
            }

            return filteredList;
        }

        public static void main(String[] args) {
            // Генерируем случайные числа в списке
            List<Integer> inputList = generateRandomList(10, 50);

            int divisor = 5;
            List<Integer> filteredList = filterDivisible(inputList, divisor);

            System.out.println("Исходный список: " + inputList);
            System.out.println("Отфильтрованный список: " + filteredList);
        }

        private static List<Integer> generateRandomList(int size, int maxValue) {
            List<Integer> randomList = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                int randomNumber = random.nextInt(maxValue) + 1;
                randomList.add(randomNumber);
            }

            return randomList;
        }
}


