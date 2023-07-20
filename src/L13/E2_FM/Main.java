package L13.E2_FM;


import L13.E2_FM.logistic.Logistic;
import L13.E2_FM.logistic.LogisticEnum;
import L13.E2_FM.logistic.RoadLogistcs;
import L13.E2_FM.logistic.SeaLogistics;
import L13.E2_FM.transport.Transport;

import java.util.Map;
import java.util.Objects;

public class Main {
    static Map<String, Logistic> logisticMap = Map.of("Road", new RoadLogistcs(), "Sea", new SeaLogistics());


    public static void main(String[] args) {
        Transport transport = getLogistic("Road");
        transport.deliver();
    }

    public static Transport getLogistic(String logistic) {
        if (Objects.equals(logistic, "Road")){
            return new RoadLogistcs().createTransport();
        }

        return new SeaLogistics().createTransport();
    }
}
