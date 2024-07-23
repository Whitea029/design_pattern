package fun.whitea.patterns.strategy;

public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
        salesMan = new SalesMan(new StrategyB());
        salesMan.salesManShow();
        salesMan = new SalesMan(new StrategyC());
        salesMan.salesManShow();
    }
}
