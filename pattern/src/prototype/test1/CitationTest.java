package prototype.test1;

import java.io.*;

public class CitationTest {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        // 创建原型对象
        Citation citation = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        citation.setStudent(stu);

        // 用对象操作流进行对象的深克隆
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
        oos.writeObject(citation);
        oos.close();
        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
        Citation citation1 = (Citation) ois.readObject();
        ois.close();

        
    }

}
