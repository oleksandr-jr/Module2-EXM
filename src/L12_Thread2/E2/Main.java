package L12_Thread2.E2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Client client = new Client(1000);

        Transaction transaction1 = new Transaction(1, client, 10);
        Transaction transaction2 = new Transaction(2, client, 500);
        Transaction transaction3 = new Transaction(3, client, 10);
        Transaction transaction4 = new Transaction(4, client, 10);
        Transaction transaction5 = new Transaction(5, client, 500);

        transaction1.start();
        transaction2.start();
        transaction3.start();
        transaction4.start();
        transaction5.start();

        Thread.sleep(2000);


        transaction1.getReceipt();
        transaction2.getReceipt();
        transaction3.getReceipt();
        transaction4.getReceipt();
        transaction5.getReceipt();

        System.out.println(client.getBalance());
    }
}
