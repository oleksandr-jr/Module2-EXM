package L12_Thread2.E2;

public class Transaction extends Thread{
    private int transactionNumber;
    private Client client;
    private String clientInfo;
    private int sum;

    private int delayTime = 1000;


    private boolean successful;

    @Override
    public void run() {
//        if (sum > 100){
//            Thread.yield();
//        }

        printStep("Before transaction : " + client.getBalance());

        //getClientInfo();
        withdrawMoney();
        //createReceipt();

        printStep("END");
    }

    public Transaction(int transactionNumber, Client client, int sum) {
        this.transactionNumber = transactionNumber;
        this.client = client;
        this.sum = sum;
    }


    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
    }

    public void getReceipt(){
        System.out.println(" ------ Receipt ------- ");
        System.out.println(" | Transaction ID : " + this.transactionNumber);
        System.out.println(" | Sum : " + sum);
        System.out.println(" | Transaction successful : " + successful);
        System.out.println(" ------=========------- ");
    }

    private void printStep(String text){
        System.out.println(" | Thread name : " + this.getName() + " | " + text);
    }



    private void getClientInfo(){
        clientInfo = client.toString();
    }

    private void withdrawMoney(){
        if (client.getBalance() - sum >= 0){
            try {
                sleep(delayTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            client.pay(sum);
            printStep("After transaction : " + client.getBalance());
            successful = true;
        }else {
            successful = false;
            printStep("Transaction declined");

        }
    }
}
