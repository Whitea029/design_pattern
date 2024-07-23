package fun.whitea.patterns.flyweight;

import java.util.HashMap;

public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("O", new OBox());
        map.put("L", new LBox());
    }

    private static BoxFactory instance = new BoxFactory();

    public static BoxFactory getInstance() {
        return instance;
    }

    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
