package fun.whitea.patterns.iterator;

import java.util.List;

public class StudentIteratorImpl implements StudentIterator {

    List<Student> students;
    private int index = 0;

    public StudentIteratorImpl(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }

    @Override
    public Student next() {
        return students.get(index++);
    }
}
