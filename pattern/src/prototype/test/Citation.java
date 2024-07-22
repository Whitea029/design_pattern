package prototype.test;

public class Citation implements Cloneable {
//    private String name;
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }

    private Student stu;
    public Student getStudent() {
        return stu;
    }
    public void setStudent(Student stu) {
        this.stu = stu;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(stu.getName() + "同学表现很好，特发此状");
    }
}
