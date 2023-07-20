package L8_StatickBlock.Init;

import common.Console;

public class AbsPerson {
    static int staticVar = 1;

    static {
        Console.printSeparator();
        Console.setColor(Console.color.RED);
        System.out.println("@ ABSTRACT @  static block");

        System.out.println("Before:");
        System.out.println("static variable == " + staticVar);

        staticVar = 2;

        System.out.println("After:");
        System.out.println("static variable == " + staticVar);

        Console.resetColor();
    }

    int nonStaticAbsVar = 1;
    {
        Console.printSeparator();
        Console.setColor(Console.color.BLUE);
        System.out.println("@ ABSTRACT @ non static block");

        System.out.println("Before:");
        System.out.println("Non static variable == " + nonStaticAbsVar);

        nonStaticAbsVar = 2;

        System.out.println("After:");
        System.out.println("Non static variable == " + nonStaticAbsVar);
        Console.resetColor();
    }

    public AbsPerson() {
        Console.printSeparator();
        Console.setColor(Console.color.GREEN);


        System.out.println("@ ABSTRACT @ constructor");
        System.out.println("Before:");
        System.out.println("Non static variable == " + nonStaticAbsVar);

        this.nonStaticAbsVar = 3;

        System.out.println("After:");
        System.out.println("Non static variable == " + nonStaticAbsVar);

        Console.resetColor();
    }
}
