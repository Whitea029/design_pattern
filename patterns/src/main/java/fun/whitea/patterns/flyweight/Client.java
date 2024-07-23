package fun.whitea.patterns.flyweight;

public class Client {
    public static void main(String[] args) {
        AbstractBox abstractBox = BoxFactory.getInstance().getShape("I");
        abstractBox.display("蓝色");
    }
}
