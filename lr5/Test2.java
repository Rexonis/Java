package lr5;

public class Test2 {
    char ch1, ch2;

   public void Setch1(char ch1) {
       this.ch1 = ch1;
   }

   public void Setch2(char ch2) {
       this.ch2 = ch2;
   }

    public void showCharArray() {

        int int1 = ch1;
        int int2 = ch2;

        if (ch1 > ch2) {
            int1 = ch2;
            int2 = ch1;
        }

        int b = 1;
        for (int i = int1; i <= int2; i++) {
            System.out.println(b + " symbol = " + (char)i);
            b++;
        }
    }
}


