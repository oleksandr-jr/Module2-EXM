package L15.E3_Anonim_Runnable;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        };


        new Thread(runnable).start();

    }
}
