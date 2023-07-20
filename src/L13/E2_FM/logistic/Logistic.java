package L13.E2_FM.logistic;

import L13.E2_FM.transport.Transport;

public abstract class Logistic {
    public void createDelivery(){
        createTransport().deliver();
    }

    public abstract Transport createTransport();
}
