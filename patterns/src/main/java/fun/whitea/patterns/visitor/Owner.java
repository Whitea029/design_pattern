package fun.whitea.patterns.visitor;

public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("feed " + cat);
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("feed " + dog);
    }
}
