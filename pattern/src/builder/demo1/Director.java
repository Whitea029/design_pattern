package builder.demo1;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike constructBike() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }

}
