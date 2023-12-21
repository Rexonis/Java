package lr5;

public class Example4 {
    public static void main(String[] args) {

        Test4 a = new Test4(65, 'A');
        System.out.println("Symbol: " + a.symbol + ", Number: " + a.number);

        Test4 b = new Test4(65.1267);
        System.out.println("Symbol: " + b.symbol + ", Number: " + b.number);
    }
}

