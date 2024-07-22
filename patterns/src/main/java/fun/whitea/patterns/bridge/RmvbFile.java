package fun.whitea.patterns.bridge;

// 具体实现化角色
public class RmvbFile implements VideoFile {

    @Override
    public void decode(String filename) {
        System.out.println("RmvbFile decode" + filename);
    }
}
