package L8_StatickBlock.Init;

import common.Console;

class Parent extends AbsPerson{
    int nonStaticParent = 1;
    {
        Console.printSeparator();
        Console.setColor(Console.color.BLUE);
        System.out.println("^ PARENT ^ non static block");

        System.out.println("Before:");
        System.out.println("Non static variable == " + nonStaticParent);

        nonStaticParent = 2;

        System.out.println("After:");
        System.out.println("Non static variable == " + nonStaticParent);

        Console.resetColor();
    }

    static int staticParent = 1;
    static {
        Console.printSeparator();
        Console.setColor(Console.color.RED);

        System.out.println("^ PARENT ^ static block");
        System.out.println("Before:");
        System.out.println("Static variable = " + staticParent);

        staticParent = 2;
        System.out.println("After:");
        System.out.println("Static variable = " + staticParent);
        Console.resetColor();
    }
    Parent() {
        staticParent = 3; nonStaticParent = 3;
        Console.printSeparator();
        Console.setColor(Console.color.GREEN);

        System.out.println("^ PARENT ^ constructor");
        System.out.println("staticParent == " + staticParent);
        System.out.println("nonStaticParent == " + nonStaticParent);
        Console.resetColor();
    }
}
