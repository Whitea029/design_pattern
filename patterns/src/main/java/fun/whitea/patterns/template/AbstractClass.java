package fun.whitea.patterns.template;

public abstract class AbstractClass {

    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pourOil() {
        System.out.println("pour oil");
    }

    public void heatOil() {
        System.out.println("heat oil");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();

    public void fry() {
        System.out.println("fry");
    }
}
