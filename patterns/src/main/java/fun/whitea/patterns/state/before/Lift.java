package fun.whitea.patterns.state.before;

public class Lift implements ILift {

    private int state;


    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("opening state");
                ;
                setState(OPENING_STATE);
            case RUNNING_STATE:
                break;
            case STOPPED_STATE:
                System.out.println("stopping state");
                setState(STOPPED_STATE);
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("closing");
                setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPED_STATE:
                System.out.println("stopping");
                setState(STOPPED_STATE);
                break;
        }
    }

    @Override
    public void run() {
        switch (state) {
            case RUNNING_STATE:
                System.out.println("running state");
                break;
            case STOPPED_STATE:
                System.out.println("stopping state");
                setState(RUNNING_STATE);
                break;
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("closing");
                setState(CLOSING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case RUNNING_STATE:
                System.out.println("running state");
                setState(RUNNING_STATE);
                break;
            case STOPPED_STATE:
                System.out.println("stopping state");
                break;
            case OPENING_STATE:
                System.out.println("opening state");
                setState(OPENING_STATE);
                break;
            case CLOSING_STATE:
                System.out.println("closing");
                setState(CLOSING_STATE);
                break;
        }
    }
}
