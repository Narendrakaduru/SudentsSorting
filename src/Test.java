import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) throws ParseException {

        Student s1 = new Student(20, "srujana", "08/24/1997", 100);
        Student s2 = new Student(21, "kavya", "03/22/1996", 200);
        Student s3 = new Student(22, "anurag", "09/20/1999", 500);
        Student s4 = new Student(23, "dhakshayani", "08/16/1995", 800);
        Student s5 = new Student(24, "suman", "05/15/1996", 300);
        Student s6 = new Student(25, "shahid", "03/27/2000", 350);
        Student s7 = new Student(26, "saba", "03/03/1993", 150);
        Student s8 = new Student(27, "mani", "02/02/1998", 750);
        Student s9 = new Student(28, "ratnam", "05/29/1992", 650);
        Student s10 = new Student(29, "rehman", "02/13/1990", 250);
        List<Student> data = new ArrayList<>();
        data.add(s1);
        data.add(s2);
        data.add(s3);
        data.add(s4);
        data.add(s5);
        data.add(s6);
        data.add(s7);
        data.add(s8);
        data.add(s9);
        data.add(s10);
        System.out.println("==================== Sort based on StudentID ========================");
        Collections.sort(data, new StudentId());
        data.stream().forEach(System.out::println);
        System.out.println("==================== Sort based on TotalMarks =======================");
        Collections.sort(data, new StudentTotalMarks());
        data.stream().forEach(System.out::println);
        System.out.println("==================== Sort based on StudentName ======================");
        Collections.sort(data, new StudentName());
        data.stream().forEach(System.out::println);
        System.out.println("==================== Sort based on StudentDOB ======================");
        Collections.sort(data, new StudentDOB());
        data.stream().forEach(System.out::println);
    }
}
