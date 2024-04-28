package lr10.Task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static javax.script.ScriptEngine.FILENAME;

public class CarBookManager {

    private static final String FILE_NAME = "src\\lr10\\Task1\\cars.xml";

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-".repeat(20) + "XML OPERATIONS" +"-".repeat(20));
            System.out.println("Выберите действие: ");
            System.out.println("1 - Просмотр списка автомобилей");
            System.out.println("2 - Добавление нового автомобиля");
            System.out.println("3 - Поиск автомобиля по производителю");
            System.out.println("4 - Поиск автомобиля по году производства");
            System.out.println("5 - Удаление автомобиля");
            System.out.println("0 - Выход");
            System.out.println("-".repeat(54));
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
                    searchCarsByManufacturer();
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
            File inputFile = new File("src\\lr10\\Task1\\cars.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("*".repeat(50));
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("car");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println(".".repeat(50));
                System.out.println("\nТекущий элемент: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Название производителя: "
                            + element.getElementsByTagName("manufacturer").item(0)
                            .getTextContent());
                    System.out.println("Модель: "
                            + element.getElementsByTagName("model").item(0)
                            .getTextContent());
                    System.out.println("Год выпуска: "
                            + element.getElementsByTagName("year").item(0)
                            .getTextContent());
                }
            }
            System.out.println("*".repeat(50));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void addNewCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите производителя:");
        String manufacturer = scanner.nextLine();

        System.out.println("Введите модель:");
        String model = scanner.nextLine();

        System.out.println("Введите год выпуска:");
        int year = scanner.nextInt();

        try {
            File inputFile = new File("src\\lr10\\Task1\\cars.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);


            Element rootElement = doc.getDocumentElement();

            Element newCar = doc.createElement("car");

            Element manufacturerElement = doc.createElement("manufacturer");
            manufacturerElement.setTextContent(manufacturer);
            newCar.appendChild(manufacturerElement);

            Element authorElement = doc.createElement("model");
            authorElement.setTextContent(model);
            newCar.appendChild(authorElement);

            Element yearElement = doc.createElement("year");
            yearElement.setTextContent(Integer.toString(year));
            newCar.appendChild(yearElement);

            rootElement.appendChild(newCar);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(inputFile);
            transformer.transform(source, result);

            System.out.println("Новый автомобиль успешно добавлен");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void searchCarsByManufacturer() throws ParserConfigurationException, IOException, SAXException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите производителя: ");
        String model = scanner.nextLine();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new File(FILE_NAME));
        doc.getDocumentElement().normalize();

        NodeList cars = doc.getElementsByTagName("car");
        List<Element> filteredCars = new ArrayList<>();

        for (int i = 0; i < cars.getLength(); i++) {
            Element car = (Element) cars.item(i);
            if (car.getElementsByTagName("manufacturer").item(0).getTextContent().equalsIgnoreCase(model)) {
                filteredCars.add(car);
            }
        }

        if (filteredCars.size() == 0) {
            System.out.println("Не найдено автомобилей производителя " + model);
        } else {
            System.out.println("Автомобили производителя " + model + ":");
            for (Element car : filteredCars) {
                System.out.println("Производитель: " + car.getElementsByTagName("manufacturer").item(0).getTextContent());
                System.out.println("Модель: " + car.getElementsByTagName("model").item(0).getTextContent());
                System.out.println("Год производства: " + car.getElementsByTagName("year").item(0).getTextContent());
                System.out.println();
            }
        }
    }

    private static void searchCarsByYear() throws ParserConfigurationException, IOException, SAXException {
        System.out.print("Введите год производства автомобиля: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new File(FILE_NAME));
        doc.getDocumentElement().normalize();
        NodeList cars = doc.getElementsByTagName("car");
        List<Element> filteredCars = new ArrayList<>();
        for (int i = 0; i < cars.getLength(); i++) {
            Element car = (Element) cars.item(i);
            int carYear = Integer.parseInt(car.getElementsByTagName("year").item(0).getTextContent());
            if (carYear == year) {
                filteredCars.add(car);
            }
        }
        if (filteredCars.size() == 0) {
            System.out.println("Не найдено автомобилей, выпущенных в " + year + " году");
        } else {
            System.out.println("Автомобили выпущенны в " + year + " году: ");
            for (Element car : filteredCars) {
                String manufacturer = car.getElementsByTagName("manufacturer").item(0).getTextContent();
                String model = car.getElementsByTagName("model").item(0).getTextContent();
                System.out.println(manufacturer + ", производитель " + model);
            }
        }
    }

    private static void deleteCar() throws ParserConfigurationException, IOException, SAXException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название модели, которую необходимо удалить:");
        String model = scanner.nextLine();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new File(FILE_NAME));
        doc.getDocumentElement().normalize();

        NodeList cars = doc.getElementsByTagName("car");
        for (int i = 0; i < cars.getLength(); i++) {
            Node car = cars.item(i);
            if (car.getNodeType() == Node.ELEMENT_NODE) {
                Element carElement = (Element) car;
                String carmanufacturer = carElement.getElementsByTagName("model").item(0).getTextContent();
                if (carmanufacturer.equals(model)) {
                    car.getParentNode().removeChild(car);
                    System.out.println("Автомобиль " + model + " удален");
                    saveChanges(doc);
                    return;
                }
            }
        }
        System.out.println("Автомобиль " + model + " не найден");
    }
    private static void saveChanges(Document document) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(FILENAME));
            transformer.transform(source, result);
            System.out.println("Сохранение изменений на " + FILENAME);
        } catch (TransformerException e) {
            System.out.println("Ошибка сохранения  " + FILENAME + ": " + e.getMessage());
        }
    }
}