package factory.static_fastory;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }


}
