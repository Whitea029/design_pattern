package fun.whitea.patterns.visitor;

public class Someone implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("Someone feed a cat");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("Someone feed a dog");
    }
}
