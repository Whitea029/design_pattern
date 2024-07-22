package fun.whitea.patterns.decorator;

// 具体装饰着角色
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(2, "Bacon", fastFood);
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
