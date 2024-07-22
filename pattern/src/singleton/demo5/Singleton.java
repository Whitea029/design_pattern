package singleton.demo5;

import java.io.Serializable;

/**
 * 懒汉式： 静态内部类方式
 */
public class Singleton implements Serializable {

    private static boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class){
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 当进行反序列化的时候，会自动调用该方法，直接获取该方法的返回值
    // 用于解决反序列化破坏单例模式
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
