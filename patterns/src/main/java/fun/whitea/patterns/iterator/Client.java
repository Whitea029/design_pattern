package fun.whitea.patterns.iterator;

public class Client {
    public static void main(String[] args) {
        StudentAggregateImpl a = new StudentAggregateImpl();
        a.addStudent(new Student());
        a.addStudent(new Student());
        a.addStudent(new Student());
        a.addStudent(new Student());

        StudentIterator studentIterator = a.getStudentIterator();

        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            System.out.println(student);
        }


    }
}
