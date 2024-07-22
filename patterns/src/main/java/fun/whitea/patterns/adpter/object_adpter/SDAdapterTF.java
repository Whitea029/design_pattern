package fun.whitea.patterns.adpter.object_adpter;

import fun.whitea.patterns.adpter.class_adpter.TFCardImpl;

public class SDAdapterTF implements SDCard {

    // 声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("SDAdapterTF readSD");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDAdapterTF writeSD");
        tfCard.writeTF(msg);
    }
}
