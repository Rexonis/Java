package lr5;

public class Test6 {

    private int min, max;

    public Test6 (int min, int max) {

        if(min <= max) {
            this.min = min;
            this.max = max;
        } else {
            this.min = max;
            this.max = min;
        }
    }

    public Test6 (int min) {
        this.min = min;
        this.max = min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void MinMax (int min, int max) {
        this.min = Math.min(max,min);
        this.max = Math.max(max,min);
        System.out.println("2 аргумента: min: " + this.min + " max: " + this.max);
    }

    public void MinMax (int min) {
        this.min = min;
        this.max = min;
        System.out.println("1 аргумент: min: " + min + " max: " + max);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}

