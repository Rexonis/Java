package lr7;

// Суперкласс
class SuperClass3 {
    // Защищенное текстовое поле
    protected String text;

    // Конструктор с текстовым параметром
    public SuperClass3(String text) {
        this.text = text;
    }

    // Метод для вывода информации об объекте
    public void displayInfo() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", Текст: " + text);
    }
}

// Первый подкласс
class SubClass3 extends SuperClass3 {
    // Защищенное целочисленное поле
    protected int number;

    // Конструктор с двумя параметрами
    public SubClass3(String text, int number) {
        super(text);
        this.number = number;
    }

    // Переопределенный метод для вывода информации об объекте
    @Override
    public void displayInfo() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", Текст: " + text + ", Число: " + number);
    }
}

// Второй подкласс
class SubClass4 extends SuperClass3 {
    // Защищенное символьное поле
    protected char symbol;

    // Конструктор с двумя параметрами
    public SubClass4(String text, char symbol) {
        super(text);
        this.symbol = symbol;
    }

    // Переопределенный метод для вывода информации об объекте
    @Override
    public void displayInfo() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", Текст: " + text + ", Символ: " + symbol);
    }
}

// Пример использования
public class Example5 {
    public static void main(String[] args) {
        // Создание объекта SuperClass
        SuperClass3 superObj = new SuperClass3("Привет");
        superObj.displayInfo(); // Вывод: Класс: SuperClass, Текст: Привет

        // Создание объекта SubClass1
        SubClass4 subObj1 = new SubClass4("Мир", (char) 42);
        subObj1.displayInfo(); // Вывод: Класс: SubClass1, Текст: Мир, Число: 42

        // Создание объекта SubClass2
        SubClass4 subObj2 = new SubClass4("Здравствуй", 'A');
        subObj2.displayInfo(); // Вывод: Класс: SubClass2, Текст: Здравствуй, Символ: A

        // Вызов метода displayInfo() через объектную переменную суперкласса
        SuperClass3 superRef = subObj1;
        superRef.displayInfo(); // Вывод: Класс: SubClass1, Текст: Мир, Число: 42
    }
}
