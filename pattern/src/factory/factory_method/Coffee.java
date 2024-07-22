package factory.factory_method;

public abstract class Coffee {

    public abstract String getName();

    public void addSugar() {
        System.out.println("Adding sugar");
    }

    public void addMilk() {
        System.out.println("Adding milk");
    }

}
