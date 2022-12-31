package L12FQ.Q1_E3_WNLoop;

public class waitLoop {
    public static void main(String[] args) {
        Person person = new Person();
        ThreadLoop threadLoop1 = new ThreadLoop(person);
        ThreadLoop threadLoop2 = new ThreadLoop(person);

        threadLoop1.start();
        threadLoop2.start();
    }
}

class ThreadLoop extends Thread {
    Person person;

    public ThreadLoop(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        try {
            person.doSomething();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

class Person {
    public synchronized void doSomething() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " " + "Notify");
        notify();


        // Что-то делаем в этом методе.
        Thread.sleep(1000);

        System.out.println(Thread.currentThread().getName() + " " + "Wait");
        wait();

        System.out.println(Thread.currentThread().getName() + " " + "Finished");
    }
}


