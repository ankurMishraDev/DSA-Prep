package OOPs.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list.add(34);
        list.add(53);
        list.add(94);
        list.add(94);
        System.out.println(list);
    }
}
