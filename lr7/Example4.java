package lr7;

// Суперкласс
class FirstClass1 {
    // Открытое символьное поле
    public char symbol;

    // Конструктор с одним параметром
    public FirstClass1(char symbol) {
        this.symbol = symbol;
    }

    // Конструктор копирования
    public FirstClass1(FirstClass1 other) {
        this.symbol = other.symbol;
    }

    // Метод toString() для вывода информации об объекте
    @Override
    public String toString() {
        return "FirstClass [symbol=" + symbol + "]";
    }
}

// Подкласс, наследующий от FirstClass
class SecondClass1 extends FirstClass1 {
    // Открытое текстовое поле
    public String text;

    // Конструктор с двумя параметрами
    public SecondClass1(char symbol, String text) {
        super(symbol);
        this.text = text;
    }

    // Конструктор копирования
    public SecondClass1(SecondClass1 other) {
        super(other);
        this.text = other.text;
    }

    // Метод toString() для вывода информации об объекте
    @Override
    public String toString() {
        return "SecondClass [symbol=" + symbol + ", text=" + text + "]";
    }
}

// Подкласс, наследующий от SecondClass
class ThirdClass1 extends SecondClass1 {
    // Открытое целочисленное поле
    public int number;

    // Конструктор с тремя параметрами
    public ThirdClass1(char symbol, String text, int number) {
        super(symbol, text);
        this.number = number;
    }

    // Конструктор копирования
    public ThirdClass1(ThirdClass1 other) {
        super(other);
        this.number = other.number;
    }

    // Метод toString() для вывода информации об объекте
    @Override
    public String toString() {
        return "ThirdClass [symbol=" + symbol + ", text=" + text + ", number=" + number + "]";
    }
}

// Пример использования
public class Example4 {
    public static void main(String[] args) {
        // Создание объекта FirstClass
        FirstClass1 firstObj = new FirstClass1('A');
        System.out.println(firstObj); // Вывод: FirstClass [symbol=A]

        // Создание объекта SecondClass
        SecondClass1 secondObj = new SecondClass1('B', "Hello");
        System.out.println(secondObj); // Вывод: SecondClass [symbol=B, text=Hello]

        // Создание объекта ThirdClass
        ThirdClass1 thirdObj = new ThirdClass1('C', "World", 42);
        System.out.println(thirdObj); // Вывод: ThirdClass [symbol=C, text=World, number=42]

        // Создание копий объектов
        FirstClass1 firstCopy = new FirstClass1(firstObj);
        SecondClass1 secondCopy = new SecondClass1(secondObj);
        ThirdClass1 thirdCopy = new ThirdClass1(thirdObj);

        System.out.println(firstCopy); // Вывод: FirstClass [symbol=A]
        System.out.println(secondCopy); // Вывод: SecondClass [symbol=B, text=Hello]
        System.out.println(thirdCopy); // Вывод: ThirdClass [symbol=C, text=World, number=42]
    }
}