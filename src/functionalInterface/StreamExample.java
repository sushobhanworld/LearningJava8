package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample
{
    public static void main(String[] args) {
        Predicate<Student> p1= (s -> s.getGpa()>=3.9);
        Predicate<Student> p2= (s->s.getGradeLevel()>=3);
        System.out.println(StudentDataBase.getAllStudents().stream()
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Student::getName,Student::getActivities)));
    }
}
