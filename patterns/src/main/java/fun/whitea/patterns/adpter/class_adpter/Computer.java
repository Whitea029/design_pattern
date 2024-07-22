package fun.whitea.patterns.adpter.class_adpter;

public class Computer {

    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException();
        }
        return sdCard.readSD();
    }

}
