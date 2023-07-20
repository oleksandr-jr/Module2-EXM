package L1.Incap;

public class Cat extends Animal {
    private String name;

    public Cat(){
        super();
    }
    public Cat(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

}
