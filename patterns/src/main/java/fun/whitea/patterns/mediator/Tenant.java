package fun.whitea.patterns.mediator;

public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contract(String contract) {
        mediator.contract(contract, this);
    }

    public void getMessage(String message) {
        System.out.println(name + " received " + message);
    }
}
