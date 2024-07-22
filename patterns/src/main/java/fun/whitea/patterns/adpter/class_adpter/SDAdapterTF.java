package fun.whitea.patterns.adpter.class_adpter;

public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("SDAdapterTF readSD");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDAdapterTF writeSD");
        writeTF(msg);
    }
}
