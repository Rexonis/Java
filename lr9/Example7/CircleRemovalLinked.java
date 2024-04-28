package lr9.Example7;
import java.util.LinkedList;

public class CircleRemovalLinked {

    public static void main(String[] args) {
        int N = 10; // количество человек в круге
        LinkedList<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size();
            circle.remove(index);
        }

        System.out.println("Последний оставшийся человек: " + circle.get(0));
    }
}
