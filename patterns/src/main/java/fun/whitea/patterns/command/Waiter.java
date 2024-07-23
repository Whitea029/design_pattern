package fun.whitea.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Command> commandList = new ArrayList<Command>();

    public void setCommand(Command command) {
        commandList.add(command);
    }

    public void orderUp() {
        System.out.println("新订单来了");
        for (Command command : commandList) {
            if (command != null) {
                command.execute();
            }
        }
    }

}
