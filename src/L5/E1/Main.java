package L5.E1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cell<String> cell = new Cell<>();

        cell.setData("Hello");

        System.out.println(cell.getData());


        List myList = new ArrayList();

        myList.add("Hello");
        myList.add("World");
        myList.add(1);

        for (Object o : myList) {
            System.out.println((String) o);
        }

//        List<String> list = Arrays.asList("Hello", "World");
//        List<Integer> data = new ArrayList(list);
//        Integer intNumber = data.get(0);
//        System.out.println(data);
    }
}
