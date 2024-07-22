package fun.whitea.patterns.decorator;

// 具体构建角色
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "Fried Noodles");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
