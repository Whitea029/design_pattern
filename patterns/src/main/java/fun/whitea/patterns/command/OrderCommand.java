package fun.whitea.patterns.command;

import java.util.Set;

public class OrderCommand implements Command {

    private SeniorChef seniorChef;
    private Order order;

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "卓的订单:");
        Set<String> keySet = order.getFoodDir().keySet();
        for (String foodName : keySet) {
            seniorChef.makeFood(foodName, order.getFoodDir().get(foodName));
        }
        System.out.println(order.getDiningTable() + "准备好了");
    }
}
