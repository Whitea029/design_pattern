package fun.whitea.patterns.singleton.demo2;

/**
 * 饿汉式：静态代码块
 */
public class Singleton {
    // 私有构造方法
    private Singleton() {}

    // 声明Singleton类型的变量
    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
