package prototype.test;

public class CitationTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原型对象
        Citation citation = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        citation.setStudent(stu);
        // 克隆奖状对象
        Citation clone = citation.clone();
        clone.getStudent().setName("李四");
//
//        citation.setName("张三");
//        clone.setName("李四");

        citation.show();
        clone.show();
    }

}
