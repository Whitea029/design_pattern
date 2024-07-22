package fun.whitea.patterns.adpter.object_adpter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);
        System.out.println("=======================");
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String s1 = computer.readSD(sdAdapterTF);
        System.out.println(s1);
    }
}


