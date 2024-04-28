package lr7;

    // Суперкласс
    class FirstClass {
        // Открытое целочисленное поле
        public int number;

        // Конструктор с одним параметром
        public FirstClass(int number) {
            this.number = number;
        }

        // Метод для присваивания значения полю с одним параметром
        public void setNumber(int number) {
            this.number = number;
        }

        // Метод toString() для вывода информации об объекте
        @Override
        public String toString() {
            return "FirstClass [number=" + number + "]";
        }
    }

    // Подкласс, наследующий от FirstClass
    class SecondClass extends FirstClass {
        // Открытое символьное поле
        public char character;

        // Конструктор с двумя параметрами
        public SecondClass(int number, char character) {
            super(number);
            this.character = character;
        }

        // Метод для присваивания значений полям с двумя параметрами (перегрузка)
        public void setData(int number, char character) {
            super.setNumber(number);
            this.character = character;
        }

        // Метод toString() для вывода информации об объекте
        @Override
        public String toString() {
            return "SecondClass [number=" + number + ", character=" + character + "]";
        }
    }

    // Подкласс, наследующий от SecondClass
    class ThirdClass extends SecondClass {
        // Открытое текстовое поле
        public String text;

        // Конструктор с тремя параметрами
        public ThirdClass(int number, char character, String text) {
            super(number, character);
            this.text = text;
        }

        // Метод для присваивания значений полям с тремя параметрами (перегрузка)
        public void setData(int number, char character, String text) {
            super.setData(number, character);
            this.text = text;
        }

        // Метод toString() для вывода информации об объекте
        @Override
        public String toString() {
            return "ThirdClass [number=" + number + ", character=" + character + ", text=" + text + "]";
        }
    }

    // Пример использования
    public class Example3 {
        public static void main(String[] args) {
            // Создание объекта FirstClass
            FirstClass firstObj = new FirstClass(42);
            System.out.println(firstObj); // Вывод: FirstClass [number=42]

            // Создание объекта SecondClass
            SecondClass secondObj = new SecondClass(100, 'A');
            System.out.println(secondObj); // Вывод: SecondClass [number=100, character=A]
            secondObj.setData(200, 'B');
            System.out.println(secondObj); // Вывод: SecondClass [number=200, character=B]

            // Создание объекта ThirdClass
            ThirdClass thirdObj = new ThirdClass(300, 'C', "Hello");
            System.out.println(thirdObj); // Вывод: ThirdClass [number=300, character=C, text=Hello]
            thirdObj.setData(400, 'D', "World");
            System.out.println(thirdObj); // Вывод: ThirdClass [number=400, character=D, text=World]
        }
    }

