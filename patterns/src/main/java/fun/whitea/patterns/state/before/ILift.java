package fun.whitea.patterns.state.before;

public interface ILift {

    int OPENING_STATE = 0;
    int CLOSING_STATE = 1;
    int RUNNING_STATE = 2;
    int STOPPED_STATE = 3;

    void setState(int state);

    void open();

    void close();

    void run();

    void stop();
}
