package fun.whitea.patterns.responsibility;

public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("hyh", 4, "身体不适");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandle(manager);
        manager.setNextHandle(generalManager);

        groupLeader.submit(leaveRequest);
    }
}
