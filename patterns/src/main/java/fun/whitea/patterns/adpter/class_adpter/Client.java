package fun.whitea.patterns.adpter.class_adpter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);
        System.out.println("=======================");
        String s1 = computer.readSD(new SDAdapterTF());
        System.out.println(s1);
    }
}
