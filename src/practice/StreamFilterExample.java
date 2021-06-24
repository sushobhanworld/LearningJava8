package practice;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    //filter by female candidate only
    public static List<Student> filterStudentsByGender() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .collect(Collectors.toList());
    }

    //filter by female candidate and grade level is more than 3.9
    public static List<Student> filterStudentsByGenderAndGrade() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGradeLevel()>3.9)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterStudentsByGender().forEach(System.out::println);
        filterStudentsByGenderAndGrade().forEach(System.out::println);
    }
}
