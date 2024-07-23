package fun.whitea.patterns.singleton.demo1;

/**
 * 饿汉式：静态成员变量
 */
public class Singleton {

    // 私有构造方法
    private Singleton (){}

    // 本类中创建本类的对象
    private static Singleton instance = new Singleton();

    // 提供静态方法获取该对象
    public static Singleton getInstance(){
        return instance;
    }

}
