package lr7;

    // Суперкласс
    class SuperClass2 {
        // Приватное текстовое поле
        private String text;

        // Конструктор с текстовым параметром
        public SuperClass2(String text) {
            this.text = text;
        }

        // Метод для присваивания значения полю без параметров
        public void setText() {
            this.text = "";
        }

        // Метод для присваивания значения полю с текстовым параметром
        public void setText(String text) {
            this.text = text;
        }

        // Доступное только для чтения свойство, возвращающее длину текстовой строки
        public int getTextLength() {
            return text.length();
        }
    }

    // Подкласс, наследующий от SuperClass
    class SubClass2 extends SuperClass2 {
        // Дополнительное открытое целочисленное поле
        public int number;

        // Конструктор с целочисленным и текстовым параметрами
        public SubClass2(int number, String text) {
            super(text);
            this.number = number;
        }

        // Метод для присваивания значения полю без параметров (переопределение)
        @Override
        public void setText() {
            super.setText();
            this.number = 0;
        }

        // Метод для присваивания значения полю с текстовым параметром (переопределение)
        @Override
        public void setText(String text) {
            super.setText(text);
            this.number = 0;
        }

        // Метод для присваивания значения полю с целочисленным параметром (перегрузка)
        public void setNumber(int number) {
            this.number = number;
        }

        // Метод для присваивания значения полям с текстовым и целочисленным параметрами (перегрузка)
        public void setData(String text, int number) {
            super.setText(text);
            this.number = number;
        }
    }

    // Пример использования
    public class Example2 {
        public static void main(String[] args) {
            // Создание объекта SuperClass
            SuperClass2 superObj = new SuperClass2("Hello");
            System.out.println("Длина текста в SuperClass: " + superObj.getTextLength()); // Вывод: Длина текста в SuperClass: 5

            // Создание объекта SubClass
            SubClass2 subObj = new SubClass2(42, "World");
            System.out.println("Длина текста в SubClass: " + subObj.getTextLength()); // Вывод: Длина текста в SubClass: 5
            System.out.println("Значение числа в SubClass: " + subObj.number); // Вывод: Значение числа в SubClass: 42

            // Вызов методов для присваивания значений полям
            subObj.setText(); // Устанавливает text = "", number = 0
            subObj.setText("Java"); // Устанавливает text = "Java", number = 0
            subObj.setNumber(100); // Устанавливает number = 100
            subObj.setData("Programming", 200); // Устанавливает text = "Programming", number = 200
        }
    }
