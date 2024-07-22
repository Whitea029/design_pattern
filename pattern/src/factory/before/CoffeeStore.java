package factory.before;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee = switch (type) {
            case "america" -> new AmericanCoffee();
            case "latte" -> new LatteCoffee();
            default -> throw new RuntimeException("Unknown coffee type");
        };
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }


}
