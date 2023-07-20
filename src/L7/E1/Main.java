package L7.E1;

public class Main {
    public static void main(String[] args) {


        AmericanBlackDuck americanBlackDuck = new AmericanBlackDuck();
        DomesticDuck domesticDuck = new DomesticDuck();

        americanBlackDuck.fly();
        domesticDuck.fly();

        Duck duck1 = (Duck) americanBlackDuck;
        Duck duck2 = (Duck) domesticDuck;

//        duck1.doFlip();
//        duck2.dance();

        duck1.fly();
        duck2.fly();

        Bird bird1 = (Bird) duck1;
        Bird bird2 = (Bird) duck2;

        bird1.fly();
        bird2.fly();

    }
}
