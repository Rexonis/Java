package lr12;

public class Example4 {
    public static void main(String[] args) {
        // Создаем 10 потоков
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                // Получаем номер текущего потока
                long threadNumber = Thread.currentThread().getId();
                System.out.println("Поток номер: " + threadNumber);
            });
            // Запускаем поток
            thread.start();
        }
    }
}
