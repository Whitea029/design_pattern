package fun.whitea.patterns.combination;

// 叶子节点
public class MenuItem extends MenuComponent {

    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
