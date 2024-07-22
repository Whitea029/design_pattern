package fun.whitea.patterns.adpter.class_adpter;

public interface TFCard {

    // 从TF卡中读取数据
    String readTF();
    // 从TF卡写数据
    void writeTF(String msg);
}
