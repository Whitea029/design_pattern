package fun.whitea.patterns.memento.white_box;

public class Client {
    public static void main(String[] args) {
        System.out.println("=====================");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("=====================");
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("=====================");
        gameRole.recoverState(caretaker.getRoleStateMemento());
        gameRole.stateDisplay();

    }
}
