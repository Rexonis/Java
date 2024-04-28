package lr8.Example1_10;

import java.io.File;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        try {
            File fl = new File("MyFile1.txt");
            fl.createNewFile();
            if (fl.exists()) {
                System.out.println("Создано");
                System.out.println("Полный путь 1: " + fl.getAbsolutePath());
            }

            // Создание файла на диске E и вывод полного пути
            File f2 = new File("E:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь 2: " + f2.getAbsolutePath());

            File f3 = new File("E:\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Полный путь 3: " + f3.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Ошибка!!! " + e);
        }
    }
}