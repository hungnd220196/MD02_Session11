package bt6;

import java.util.ArrayList;
import java.util.List;

public class ListDemo6 {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        listNum.add(1);
        listNum.add(6);
        listNum.add(9);
        listNum.add(2);
        listNum.add(5);
        for (int i = 0; i < listNum.size() - 1; i++) {
            for (int j = i + 1; j < listNum.size(); j++) {
                if (listNum.get(i) < listNum.get(j)) {
                    Integer temp = listNum.get(i);
                    listNum.set(i, listNum.get(j));
                    listNum.set(j, temp);
                }
            }
        }
        System.out.println(listNum);
    }


}
