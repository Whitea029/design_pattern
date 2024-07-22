package fun.whitea.patterns.decorator;

public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + " " + food.cost());
        System.out.println("======================");
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost());
        System.out.println("==============");
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost());
    }
}
