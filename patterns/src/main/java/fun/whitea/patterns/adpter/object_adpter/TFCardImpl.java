package fun.whitea.patterns.adpter.object_adpter;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TFCard read";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write: " + msg);
    }
}
