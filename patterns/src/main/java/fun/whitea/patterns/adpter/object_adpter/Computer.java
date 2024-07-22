package fun.whitea.patterns.adpter.object_adpter;

public class Computer {

    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException();
        }
        return sdCard.readSD();
    }

}
