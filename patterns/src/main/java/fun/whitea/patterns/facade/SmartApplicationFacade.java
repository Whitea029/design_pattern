package fun.whitea.patterns.facade;

// 外观类
public class SmartApplicationFacade {

    // 聚合电灯 空调 电视对象
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartApplicationFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String message) {
        if (message.contains("open")) {
            on();
        } else if (message.contains("off")) {
            off();
        } else {
            System.out.println("Something went wrong");
        }
    }

    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }

}
