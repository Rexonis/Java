package lr6;

public class Example1 {
    public static void main(String[] args) {

        Test1 test1 = new Test1();

        test1.setCh10rStr1("l");
        test1.setCh10rStr1("Привет");

        System.out.println(test1.ch1);
        System.out.println(test1.str1);

        char[] chars1 = new char[5];
        chars1[0] = 'П';
        chars1[1] = 'о';
        chars1[2] = 'к';
        chars1[3] = 'а';
        chars1[4] = '!';
        test1.setCh10rStr1(chars1);
        System.out.println(test1.str1);

        char[] chars2 = new char[1];
        chars2[0] = 'Ц';

        test1.setCh10rStr1(chars2);
        System.out.println(test1.ch1);
    }
}
