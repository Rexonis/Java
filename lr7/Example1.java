package lr7;

    class SuperClass {
        // Приватное текстовое поле
        private String text;

        // Конструктор с текстовым параметром
        public SuperClass(String text) {
            this.text = text;
        }

        // Переопределенный метод toString()
        @Override
        public String toString() {
            return "SuperClass: " + text;
        }
    }

    // Подкласс, наследующий от SuperClass
    class SubClass extends SuperClass {
        // Дополнительное приватное текстовое поле
        private String additionalText;

        // Конструктор с одним текстовым аргументом
        public SubClass(String text) {
            super(text);
            this.additionalText = "";
        }

        // Конструктор с двумя текстовыми аргументами
        public SubClass(String text, String additionalText) {
            super(text);
            this.additionalText = additionalText;
        }

        // Переопределенный метод toString()
        @Override
        public String toString() {
            if (additionalText.isEmpty()) {
                return "SubClass: " + super.toString();
            } else {
                return "SubClass: " + super.toString() + ", " + additionalText;
            }
        }
    }

    // Пример использования
    public class Example1 {
        public static void main(String[] args) {
            // Создание объекта SuperClass
            SuperClass superObj = new SuperClass("Hello");
            System.out.println(superObj); // Вывод: SuperClass: Hello

            // Создание объекта SubClass с одним аргументом
            SubClass subObj1 = new SubClass("World");
            System.out.println(subObj1); // Вывод: SubClass: SuperClass: World

            // Создание объекта SubClass с двумя аргументами
            SubClass subObj2 = new SubClass("Java", "Programming");
            System.out.println(subObj2); // Вывод: SubClass: SuperClass: Java, Programming
        }
    }

