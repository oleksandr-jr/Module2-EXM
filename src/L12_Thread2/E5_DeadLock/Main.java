package L12_Thread2.E5_DeadLock;

public class Main {
    static class Deadlocker {
        private Deadlocker other;

        public static void main(String[] args) {
            final Deadlocker d1 = new Deadlocker();
            final Deadlocker d2 = new Deadlocker();
            d1.setOther(d2);
            d2.setOther(d1);

            Thread t1 = new Thread() {
                public void run() {
                    d1.doSomethingWithOther();
                }
            };

            Thread t2 = new Thread() {
                public void run() {
                    d2.doSomethingWithOther();
                }
            };

            t1.start();
            t2.start();
        }

        public void setOther(Deadlocker other) {
            this.other = other;
        }

        synchronized void doSomethingWithOther() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
            other.doSomething();
        }

        synchronized void doSomething() {
        }
    }


}
