package bt2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {

        List<Integer> listnumber = new ArrayList<>();
        listnumber.add(1);
        listnumber.add(2);
        listnumber.add(3);
        listnumber.add(4);
        listnumber.add(5);
        List<Integer> reverseList = new ArrayList<>();
        for (int i = listnumber.size()-1; i >=0 ; i--) {
            reverseList.add(listnumber.get(i));
        }
        System.out.println("List đảo là " + reverseList);
    }
}
