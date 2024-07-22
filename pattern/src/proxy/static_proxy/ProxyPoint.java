package proxy.static_proxy;

public class ProxyPoint implements SellTickets {

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点，卖票，收取一些服务费用");
        trainStation.sell();
    }
}
