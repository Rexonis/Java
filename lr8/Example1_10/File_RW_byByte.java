package lr8.Example1_10;

import java.io.*;

public class File_RW_byByte {

    public static void main(String[] args) throws IOException {
        FileReader in = null; // можно сразу записать FileReader in=null;
        FileWriter out=null; // можно сразу записать FileWriter out =null;
        try {
            in = new FileReader("E:\\MyFile1.txt"); // файл для чтения
            out = new FileWriter("E:\\MyFile2.txt", true); // файл для записи
            int oneByte; // переменная, в которую считываются данные
            while ((oneByte = in.read()) != -1) {
                out.append((char) oneByte); // запись с добавлением данных в конец
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }
    }
}

