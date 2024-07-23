package fun.whitea.patterns.combination;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponentList.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponentList.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        System.out.println(name);

        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
