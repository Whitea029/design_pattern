package fun.whitea.patterns.visitor;

public class Dog implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("www");
    }
}
