package practice;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {
    //sort the student database according to the name
    public static List<Student> sortByName() {
        return StudentDataBase.getAllStudents().stream()
                //.map(Student::getName)
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    //sort the student database according to the gpa
    public static List<Student> sortByGPA() {
        return StudentDataBase.getAllStudents().stream()
                //.map(Student::getName)
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    //sort reverse the student database according to the gpa
    public static List<Student> sortByGPAReverse() {
        return StudentDataBase.getAllStudents().stream()
                //.map(Student::getName)
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        sortByName().forEach(System.out::println);
        sortByGPA().forEach(System.out::println);
        sortByGPAReverse().forEach(System.out::println);
    }
}
