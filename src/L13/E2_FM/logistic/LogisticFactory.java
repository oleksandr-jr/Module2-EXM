package L13.E2_FM.logistic;

public class LogisticFactory {
    public static Logistic getLogistic(LogisticEnum logistic){
        return  logistic.getInstance();
    }
}
