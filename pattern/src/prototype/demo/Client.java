package prototype.demo;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个原型类对象
        RealizeType rt = new RealizeType();
        // 调用RealizeType类的中的clone方法进行对象的克隆
        RealizeType clone = rt.clone();
        System.out.println(clone == rt);
    }
}
