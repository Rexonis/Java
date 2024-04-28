package lr8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        // Путь к исходному файлу
        String inputFilePath = "src/input.txt";
        // Путь к результирующему файлу
        String outputFilePath = "src/output.txt";

        try {
            // Чтение строк из исходного файла
            List<String> lines = readLinesFromFile(inputFilePath);

            // Извлечение слов, начинающихся с согласных букв, и запись в результирующий файл
            writeConsonantWordsToFile(outputFilePath, lines);

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
     * Записывает слова, начинающиеся с согласных букв, в результирующий файл.
     *
     * @param filePath Путь к результирующему файлу
     * @param lines Список строк из исходного файла
     * @throws IOException Если возникла ошибка при записи в файл
     */
    private static void writeConsonantWordsToFile(String filePath, List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), StandardCharsets.UTF_8))) {
            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] words = line.split(" ");
                int consonantWordCount = 0;

                // Запись номера строки и количества выбранных слов
                writer.write("Строка " + (i + 1) + ": ");
                writer.write(String.valueOf(words.length));
                writer.write(" слов, из них ");

                for (String word : words) {
                    if (isConsonant(word.charAt(0))) {
                        writer.write(word + " ");
                        consonantWordCount++;
                    }
                }

                writer.write("(" + consonantWordCount + " слов)");
                writer.newLine();
            }
        }
    }

    /**
     * Проверяет, является ли символ согласной буквой.
     *
     * @param c Символ для проверки
     * @return true, если символ является согласной буквой, false в противном случае
     */
    private static boolean isConsonant(char c) {
        return !Character.isLetter(c) || !Character.isLowerCase(c);
    }
}
