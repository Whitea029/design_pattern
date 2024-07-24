package fun.whitea.patterns.state.after;

public class Context {

    public static final OpenState OPEN = new OpenState();
    public static final ClosingState CLOSING = new ClosingState();
    public static final RunningState RUNNING = new RunningState();
    public static final StoppingState STOPPING = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }
    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }
    public void stop() {
        this.liftState.stop();
    }
}
