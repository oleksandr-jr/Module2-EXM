package L13.E2_FM.logistic;

import L13.E2_FM.transport.Ship;
import L13.E2_FM.transport.Transport;

public class SeaLogistics extends Logistic {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
