package lr5;

public class Test5 {

    private int number;

    public Test5() {
        setNumber(0);
    }

    public Test5(int number) {
        setNumber(number);
    }

    public void setNumber(int number) {
        this.number = (number > 100) ? 100 : number;
    }

    public int getNumber() {
        return number;
    }
}
