package fun.whitea.patterns.singleton.demo3;

/**
 * 懒汉式
 */
public class Singleton {

    private Singleton() {}

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
