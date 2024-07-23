package fun.whitea.patterns.responsibility;

public class GeneralManager extends Handle {

    public GeneralManager() {
        super(Handle.NUM_TWO, Handle.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "day" + leaveRequest.getContent());
        System.out.println("总经理同意");
    }
}
