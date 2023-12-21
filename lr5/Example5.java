package lr5;

public class Example5 {

    public static void main(String[] args) {

        Test5 a = new Test5();
        System.out.println("Number: " + a.getNumber());

        a.setNumber(150);
        System.out.println("Number: " + a.getNumber());

        Test5 b = new Test5(80);
        System.out.println("Number: " + b.getNumber());
    }
}
