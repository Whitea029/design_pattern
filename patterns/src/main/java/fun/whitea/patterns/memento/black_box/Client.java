package fun.whitea.patterns.memento.black_box;


public class Client {
    public static void main(String[] args) {
        System.out.println("=====================");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(gameRole.saveState());

        System.out.println("=====================");
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("=====================");
        gameRole.recoverState(caretaker.getMemento());
        gameRole.stateDisplay();

    }
}
