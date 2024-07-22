package singleton.demo5;

import java.lang.reflect.Constructor;

/**
 * 通过反射破坏单例模式
 */
public class Client1 {

    public static void main(String[] args) throws Exception {
        // 获取字节码对象
        Class<Singleton> singletonClass = Singleton.class;
        // 获取无参构造方法对象
        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
        // 取消访问检查
        declaredConstructor.setAccessible(true);
        // 创建singleton对象
        Singleton singleton1 = declaredConstructor.newInstance();
        Singleton singleton2 = declaredConstructor.newInstance();
        // false
        System.out.println(singleton1 == singleton2);
    }

}
