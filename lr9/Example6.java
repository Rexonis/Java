package lr9;
import java.util.HashMap;
import java.util.Map;

public class Example6 {
        public static void main(String[] args) {
            // Создаем HashMap и заполняем его 10 объектами <Integer, String>
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Один");
            map.put(2, "Два");
            map.put(3, "Три");
            map.put(4, "Четыре");
            map.put(5, "Пять");
            map.put(6, "Шесть");
            map.put(7, "Семь");
            map.put(8, "Восемь");
            map.put(9, "Девять");
            map.put(10, "Десять");

            // Находим строки, у которых ключ > 5
            System.out.println("Строки, у которых ключ > 5:");
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getKey() > 5) {
                    System.out.println(entry.getValue());
                }
            }

            // Если ключ = 0, выводим строки через запятую
            if (map.containsKey(0)) {
                System.out.println("\nСтроки, у которых ключ = 0:");
                System.out.println(map.get(0));
            }

            // Перемножаем все ключи, где длина строки > 5
            int product = 1;
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().length() > 5) {
                    product *= entry.getKey();
                }
            }
            System.out.println("\nПроизведение ключей, где длина строки > 5: " + product);
        }
    }

