package fun.whitea.patterns.observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();
        User user1 = new User("a");
        User user2 = new User("b");
        User user3 = new User("c");

        subject.attach(user1);
        subject.attach(user2);
        subject.attach(user3);

        subject.notifyObservers("hello");
    }
}
