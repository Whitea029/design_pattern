package fun.whitea.patterns.responsibility;

public class Manager extends Handle {

    public Manager() {
        super(Handle.NUM_ONE, Handle.NUM_TWO);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "day" + leaveRequest.getContent());
        System.out.println("部门经理同意");
    }
}
