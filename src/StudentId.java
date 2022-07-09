import java.util.Comparator;

public class StudentId implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStdId().compareTo(o2.getStdId());
    }

}
