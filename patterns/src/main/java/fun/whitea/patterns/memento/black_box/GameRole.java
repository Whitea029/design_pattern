package fun.whitea.patterns.memento.black_box;

public class GameRole {

    private int vit;
    private int atk;
    private int def;

    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    public void recoverState(Memento memento) {
        RoleStateMemento roleStateCaretaker = (RoleStateMemento) memento;
        this.vit = roleStateCaretaker.getVit();
        this.atk = roleStateCaretaker.getAtk();
        this.def = roleStateCaretaker.getDef();
    }

    public void stateDisplay() {
        System.out.println(this.vit);
        System.out.println(this.atk);
        System.out.println(this.def);
    }


    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    private class RoleStateMemento implements Memento{
        private int vit;
        private int atk;
            private int def;

            public RoleStateMemento(int vit, int atk, int def) {
                this.vit = vit;
                this.atk = atk;
                this.def = def;
            }
            public RoleStateMemento() {}

            public int getVit() {
                return vit;
            }

            public void setVit(int vit) {
                this.vit = vit;
            }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }

    }

}
