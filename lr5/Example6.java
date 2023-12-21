package lr5;

public class Example6 {
    public static void main(String[] args) {

        Test6 test1 = new Test6(1,2);
        System.out.println("С 2 аргументами: min: " + test1.getMin() + " max: " + test1.getMax());

        Test6 test2 = new Test6(2,1);
        System.out.println("С 2 аргументами: min: " + test2.getMin() + " max: " + test2.getMax());

        Test6 test4 = new Test6(244);
        System.out.println("С 1 аргумент: min: " + test4.getMin() + " max: " + test4.getMax());

        int a, b, c;
        c = 6;
        Test6 test6 = new Test6(c);
        test6.MinMax(c);

        a = 5;
        b = 2;
        Test6 test3 = new Test6(a, b);
        test3.setMin(a);
        test3.setMax(b);
        test3.MinMax(a, b);
    }
}

