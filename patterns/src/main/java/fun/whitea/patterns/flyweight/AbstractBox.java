package fun.whitea.patterns.flyweight;

// 抽象享元角色
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color) {
        System.out.println("Shape: " + getShape() + " color: " + color);
    }

}
