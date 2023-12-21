package lr5;

public class Test4 {
    char symbol;
    int number;

    public Test4(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    public Test4(double value) {
        int symbolCode = (int) value;
        this.symbol = (char) symbolCode;
        this.number = (int) ((value - symbolCode) * 100);
    }
}
