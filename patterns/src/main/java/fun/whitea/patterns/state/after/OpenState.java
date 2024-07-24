package fun.whitea.patterns.state.after;

public class OpenState extends LiftState{
    @Override
    public void open() {
        System.out.println("Open State");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING);
        super.context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
