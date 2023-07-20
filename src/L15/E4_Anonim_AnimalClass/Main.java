package L15.E4_Anonim_AnimalClass;

class Animal {
    public void eat(){
        System.out.println("Animal is eating...");
    }

    public void walk(){
        System.out.println("Animal is walking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();

        Animal cat = new Animal(){
            @Override
            public void eat() {
                System.out.println("Cat is eating...");
            }
        };

        cat.eat();
        cat.walk();
    }
}
