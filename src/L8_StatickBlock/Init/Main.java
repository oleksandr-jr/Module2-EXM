package L8_StatickBlock.Init;

/*
    1) PARENT всегда первый

    2) Сначала статические переменные:
        - static variable (PARENT)
        - static variable (CHILD)

    3) Затем пары: нестатические переменные + конструктор
        - non-static variable (PARENT)
        - constructor (PARENT)

        - non-static variable (CHILD)
        - constructor (CHILD)
 */

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
    }




}