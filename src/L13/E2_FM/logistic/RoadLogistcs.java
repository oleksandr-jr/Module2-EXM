package L13.E2_FM.logistic;

import L13.E2_FM.transport.Transport;
import L13.E2_FM.transport.Truck;

public class RoadLogistcs extends Logistic {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
