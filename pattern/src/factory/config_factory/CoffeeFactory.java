package factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class CoffeeFactory {

    // 加载配置文件，获取配置文件中配置的全类名，并创建该类的对象
    private static HashMap<String, Coffee> map = new HashMap<>();
    static {
        Properties properties = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(is);
            properties.keySet().forEach(
                    key -> {
                        String className = properties.getProperty((String) key);
                        // 通过反射创建对象
                        try {
                            Class<?> clazz = Class.forName(className);
                            Coffee coffee = (Coffee) clazz.newInstance();
                            map.put((String) key, coffee);
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name) {
        return map.get(name);
    }

}
