package fun.whitea.patterns.responsibility;

public class GroupLeader extends Handle {

    public GroupLeader() {
        super(0, Handle.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "day" + leaveRequest.getContent());
        System.out.println("小组长同意");
    }
}
