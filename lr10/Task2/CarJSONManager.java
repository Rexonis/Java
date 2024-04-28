package lr10.Task2;


import javax.xml.parsers.ParserConfigurationException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import static javax.script.ScriptEngine.FILENAME;


public class CarJSONManager {
    private static final String FILE_NAME = "src\\lr10\\Task2\\cars.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Просмотр списка автомобилей");
            System.out.println("2 - Добавление нового автомобиля");
            System.out.println("3 - Поиск автомобиля по модели");
            System.out.println("4 - Поиск автомобиля по году");
            System.out.println("5 - Удаление автомобиля");
            System.out.println("0 - Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    displayCars();
                    break;
                case 2:
                    addNewCar();
                    break;
                case 3:
                    searchCarsByModel();
                    break;
                case 4:
                    searchCarsByYear();
                    break;
                case 5:
                    deleteCar();
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор, повторите попытку");
            }
        }
    }
    private static void displayCars() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src\\lr10\\Task2\\cars.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("cars");

            for (Object o : jsonArray) {
                JSONObject car = (JSONObject) o;
                System.out.println("\nТекущий элемент: car");
                System.out.println("\nПроизводитель: " + car.get("manufacturer"));
                System.out.println("\nМодель: " + car.get("model"));
                System.out.println("\nГод выпуска: " + car.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addNewCar() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите производителя: ");
            String manufacturer = scanner.nextLine();
            System.out.println("Введите модель автомобиля: ");
            String model = scanner.nextLine();
            System.out.println("Введите год выпуска: ");
            int year = scanner.nextInt();

            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src\\lr10\\Task2\\cars.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("cars");

            JSONObject newCar = new JSONObject();
            newCar.put("manufacturer", manufacturer);
            newCar.put("model", model);
            newCar.put("year", year);
            jsonArray.add(newCar);

            jsonObject.put("cars", jsonArray);

            FileWriter fileWriter = new FileWriter("src\\lr10\\Task2\\cars.json");
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.flush();
            fileWriter.close();

            System.out.println("Автомобиль добавлен в файл");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void searchCarsByYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год автомобиля:");
        int year = scanner.nextInt();

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src\\lr10\\Task2\\cars.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("cars");

            System.out.println("Результаты поиска автомобилей " + year + " года:");
            boolean found = false;
            for (Object o : jsonArray) {
                JSONObject car = (JSONObject) o;
                int carYear = Integer.parseInt(car.get("year").toString());
                if (carYear == year) {
                    System.out.println("Производитель: " + car.get("manufacturer"));
                    System.out.println("Модель: " + car.get("model"));
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Автомобили " + year + " года не найдены");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static void searchCarsByModel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите модель автомобиля:");
        String model = scanner.nextLine();

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src\\lr10\\Task2\\cars.json"));
            JSONObject jsonObject = (JSONObject) obj;
            Object carsObj = jsonObject.get("cars");

            if (carsObj instanceof JSONArray) {
                JSONArray jsonArray = (JSONArray) carsObj;
                System.out.println("Результаты поиска моделей " + model + ":");
                boolean found = false;
                for (Object o : jsonArray) {
                    JSONObject car = (JSONObject) o;
                    if (car.get("model").equals(model)) {
                        System.out.println("Производитель: " + car.get("manufacturer"));
                        System.out.println("Год: " + car.get("year"));
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Автомобили по данной модели не найдены");
                }
            } else {
                System.out.println("Ошибка: структура данных некорректна.");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static void deleteCar() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите производителя которого удалить: ");
            String manufacturer = scanner.nextLine();

            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src\\lr10\\Task2\\cars.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("cars");

            boolean found = false;
            Iterator<Object> iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject car = (JSONObject) iterator.next();
                if (car.get("manufacturer").equals(manufacturer)) {
                    iterator.remove();
                    found = true;
                    break;
                }
            }

            if (found) {
                jsonObject.put("cars", jsonArray);
                FileWriter fileWriter = new FileWriter("src\\lr10\\Task2\\cars.json");
                fileWriter.write(jsonObject.toJSONString());
                fileWriter.flush();
                fileWriter.close();
                System.out.println("Производитель удален");
            } else {
                System.out.println("Производитель не найден");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
