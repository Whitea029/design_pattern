package fun.whitea.patterns.visitor;

public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Cat());
        home.add(new Dog());
        Owner owner = new Owner();
        home.action(owner);
    }
}
