package singleton.demo5;

import singleton.demo3.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 通过序列化和反序列化破坏单例模式
 */
public class Client {

    public static void main(String[] args) throws Exception {
        write();
        read();
        read();
        // 两次读取的instance不一样
    }

    // 向文件中写数据（对象）
    public static void read() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(""));
        Singleton singleton = (Singleton) ois.readObject();
        System.out.println(singleton);
        ois.close();
    }
    // 向文件中读数据（对象）
    public static void write() throws Exception {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(""));
        objectOutputStream.writeObject(instance);
        objectOutputStream.close();
    }
}
