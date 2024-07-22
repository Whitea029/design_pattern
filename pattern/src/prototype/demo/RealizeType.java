package prototype.demo;

public class RealizeType implements Cloneable {

    public RealizeType(){
        System.out.println("RealizeType");
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("Cloning RealizeType object");
        return (RealizeType) super.clone();
    }
}
