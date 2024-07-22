package proxy.jdk_proxy;

import proxy.static_proxy.SellTickets;
import proxy.static_proxy.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();

    /*
    *   ClassLoader loader: 类加载器，用于加载代理类，可以通过目标对象获取类加载器
    *   Class<?>[] interfaces: 代理类实现的接口的字节码对象
    *   InvocationHandler h: 代理对象的调用处理程序
    * */
    public SellTickets getProxyObject() {
        // 返回代理对象
        return (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke方法执行了");
                        return null;
                    }
                }
        );
    }

}
