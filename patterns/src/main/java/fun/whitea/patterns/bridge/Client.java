package fun.whitea.patterns.bridge;

public class Client {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new Mac(new AviFile());
        operatingSystem.play("123");
    }
}
