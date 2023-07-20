package L8_StatickBlock.Init;


import common.Console;

class Child extends Parent {
    int nonStaticChild = 1;
    {
        Console.printSeparator();
        Console.setColor(Console.color.BLUE);
        System.out.println("_ CHILD _ non static block");
        nonStaticChild = 2;
        System.out.println("nonStaticChild == " + this.nonStaticChild);
        Console.resetColor();
    }

    static int staticChild = 1;
    static {
        Console.printSeparator();
        Console.setColor(Console.color.RED);
        System.out.println("_ CHILD _ static block");
        staticChild = 2;
        System.out.println("staticChild == " + staticChild);

        Console.resetColor();
    }

    Child() {
        staticChild = 3; nonStaticChild = 3;
        Console.printSeparator();
        System.out.print(Console.color.GREEN);
        System.out.println("_ CHILD _ constructor");
        System.out.println("staticChild == " + staticChild);
        System.out.println("nonStaticChild == " + nonStaticChild);
        Console.resetColor();
    }
}