package builder.demo1;

public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setFrame("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
