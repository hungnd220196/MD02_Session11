package bt11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrNumber = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrNumber.add((int) (Math.random() * 10));
        }
        System.out.println("mảng ban đầu " + arrNumber);
        System.out.println("gái trị nhỏ nhất "+Collections.min(arrNumber));

    }
}
