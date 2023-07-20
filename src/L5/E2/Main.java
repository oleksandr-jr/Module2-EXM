package L5.E2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Child> children = new ArrayList<>();

        children.add(new Child());
        children.add(new Child());
        children.add(new Child());

        test(children);


        List<Parent> parents = new ArrayList<>();

        parents.add(new Parent());
        parents.add(new Parent());
        parents.add(new Parent());

        test(parents);

    }

    public static void test(List<? extends Parent> list) {

        for (Parent parent : list) {
            parent.printMessage();
        }
    }
}


