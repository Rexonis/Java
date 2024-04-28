package lr8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        // Путь к исходному файлу
        String inputFilePath = "src\\input.txt";
        // Путь к результирующему файлу
        String outputFilePath = "src\\output.txt";

        try {
            // Чтение данных из исходного файла
            List<String> lines = readLinesFromFile(inputFilePath);

            // Фильтрация и запись данных в результирующий файл
            writePositiveDoublesToFile(outputFilePath, lines);

            System.out.println("Данные успешно записаны в файл: " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }

    /**
     * Читает строки из файла и возвращает их в виде списка.
     *
     * @param filePath Путь к файлу
     * @return Список строк из файла
     * @throws IOException Если возникла ошибка при чтении файла
     */
    private static List<String> readLinesFromFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        return lines;
    }

    /**
     * Записывает вторую строку и положительные числа типа double в результирующий файл.
     *
     * @param filePath Путь к результирующему файлу
     * @param lines Список строк из исходного файла
     * @throws IOException Если возникла ошибка при записи в файл
     */
    private static void writePositiveDoublesToFile(String filePath, List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), StandardCharsets.UTF_8))) {
            // Запись второй строки
            writer.write(lines.get(1));
            writer.newLine();

            // Запись положительных чисел типа double
            for (int i = 2; i < lines.size(); i++) {
                double value = Double.parseDouble(lines.get(i));
                if (value > 0) {
                    writer.write(String.valueOf(value));
                    writer.newLine();
                }
            }
        }
    }
}