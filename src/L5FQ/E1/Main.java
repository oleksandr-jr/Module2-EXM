package L5FQ.E1;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();

        Child child = new Child();

        Integer integer = 5;

        System.out.println(integer.getClass() == Integer.class);
        System.out.println(integer.getClass().equals(Number.class));

        System.out.println("Instanceof :");
        System.out.println(integer instanceof Number);

        System.out.println(integer.getClass().getSuperclass().equals(Number.class));

        System.out.println(Number.class.isInstance(integer));


    }
}
