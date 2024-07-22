package factory.static_fastory;


public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = switch (type) {
            case "america" -> new AmericanCoffee();
            case "latte" -> new LatteCoffee();
            default -> throw new RuntimeException("Unknown coffee type");
        };

        return coffee;
    }
}
