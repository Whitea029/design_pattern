package fun.whitea.patterns.facade;

public class Client {
    public static void main(String[] args) {
        // 创建一个智能音箱即可
        SmartApplicationFacade smartApplicationFacade = new SmartApplicationFacade();
        smartApplicationFacade.say("open");
        smartApplicationFacade.say("off");

    }
}
