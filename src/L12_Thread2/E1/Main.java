package L12_Thread2.E1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.value = 10;

        MyThread thread1 = new MyThread(resource);
        MyThread thread2 = new MyThread(resource);

        thread1.start();
        thread2.start();

//        thread1.join();
//        thread2.join();

        System.out.println(resource.value);
    }
}

class MyThread extends Thread {
    Resource resource;

    public MyThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeValue();
    }
}

class Resource {
    int value;

    public void changeValue(){
        int i = this.value;
        i++;
        this.value = i;
    }
}
