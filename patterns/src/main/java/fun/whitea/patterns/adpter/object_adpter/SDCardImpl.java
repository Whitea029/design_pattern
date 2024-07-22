package fun.whitea.patterns.adpter.object_adpter;

public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        return "SDCard read";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write:" + msg);
    }
}
