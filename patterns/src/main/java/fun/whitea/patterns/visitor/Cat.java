package fun.whitea.patterns.visitor;

public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("mmm");
    }
}
