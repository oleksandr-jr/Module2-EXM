package L13.E2_FM.logistic;

public enum LogisticEnum {
    ROAD(new RoadLogistcs()),
    SEA(new SeaLogistics());

    private final Logistic logistic;
    LogisticEnum(Logistic logistic) {
        this.logistic = logistic;
    }

    public Logistic getInstance(){
        return logistic;
    }
}
