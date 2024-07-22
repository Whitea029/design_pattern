package fun.whitea.patterns.decorator;

// 具体构建角色
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "Fried Rice");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
