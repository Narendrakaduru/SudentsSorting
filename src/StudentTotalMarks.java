import java.util.Comparator;

public class StudentTotalMarks implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getTotalmarks().compareTo(o2.getTotalmarks());
    }
}