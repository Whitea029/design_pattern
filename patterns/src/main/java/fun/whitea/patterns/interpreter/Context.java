package fun.whitea.patterns.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable var, int value) {
        map.put(var, value);
    }

    public int getValue(Variable var) {
        return map.get(var);
    }

}
