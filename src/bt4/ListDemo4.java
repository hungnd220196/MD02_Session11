package bt4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo4 {
    public static void main(String[] args) {
        String string = "Rekkei Academy để nông dân biết code";
        List<String> stringList = new ArrayList<>();
        String[] arrStr = string.split("\\s");
        System.out.println(Arrays.toString(arrStr));
        for (String word : arrStr) {
            stringList.add(word.trim());
        }
        System.out.println("Danh sách những phần tử lớn hơn 3");
        for (String word : stringList) {
            if (word.length() > 3) {
                System.out.println(word);
            }
        }
    }
}
