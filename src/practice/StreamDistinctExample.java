package practice;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDistinctExample {
    public static Map<String, Long> printStudentActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(s ->s, Collectors.counting()));
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
    }
}
