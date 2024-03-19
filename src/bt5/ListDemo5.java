package bt5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo5 {
    public static void main(String[] args) {
        String string = "Rekkei Academy để nông dân biết mà code";
        List<String> stringList = new ArrayList<>();
        String[] arrStr = string.split("\\s");
        System.out.println(Arrays.toString(arrStr));
        for (String word : arrStr) {
            stringList.add(word.trim());
        }
        List<String> stringListsub = new ArrayList<>();
        int min = stringList.get(0).length();
        for (String word : stringList) {
            if (word.length() < min) {
                stringListsub.clear();
                stringListsub.add(word);
                min = word.length();

            } else if (word.length() == min) {
                stringListsub.add(word);
            }
        }
        System.out.println("phần tử nhỏ nhất là " + stringListsub);

    }
}
