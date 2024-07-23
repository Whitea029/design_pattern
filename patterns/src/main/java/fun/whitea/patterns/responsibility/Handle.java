package fun.whitea.patterns.responsibility;

public abstract class Handle {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_TWO = 2;
    protected final static int NUM_SEVEN = 3;

    private int numStart;
    private int numEnd;

    private Handle nextHandle;

    public Handle(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public Handle(int numStart) {
        this.numStart = numStart;
    }

    public void setNextHandle(Handle nextHandle) {
        this.nextHandle = nextHandle;
    }

    protected abstract void handleLeave(LeaveRequest leaveRequest);

    public final void submit(LeaveRequest leaveRequest) {
        this.handleLeave(leaveRequest);
        if (this.nextHandle != null && leaveRequest.getNum() > this.numEnd) {
            this.nextHandle.submit(leaveRequest);
        } else {
            System.out.println("流程结束");
        }
    }
}
