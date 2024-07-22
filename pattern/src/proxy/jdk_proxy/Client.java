package proxy.jdk_proxy;

import proxy.static_proxy.SellTickets;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();

    }
}
