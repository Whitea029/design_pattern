package fun.whitea.patterns.mediator;

public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void construct(String message) {
        mediator.contract(message, this);
    }

    public void receive(String message) {
        System.out.println("HouseOwner: " + message);
    }
}
