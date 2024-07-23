package fun.whitea.patterns.command;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.setDiningTable(1);
        order.setFood("西红柿", 1);

        SeniorChef seniorChef = new SeniorChef();
        OrderCommand orderCommand = new OrderCommand(seniorChef, order);

        Waiter waiter = new Waiter();
        waiter.setCommand(orderCommand);

        waiter.orderUp();
    }
}
