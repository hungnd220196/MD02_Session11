package bt9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(4);
        List<Integer> newNumber = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            if (!newNumber.contains(number.get(i))) {
                newNumber.add(number.get(i));
            }
        }
        System.out.println(newNumber);

    }
}
