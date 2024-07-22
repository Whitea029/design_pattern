package fun.whitea.patterns.decorator;

// 具体装饰着角色
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(1, "Egg", fastFood);
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
