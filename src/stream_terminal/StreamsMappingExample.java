package stream_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsMappingExample
{
    public static void main(String[] args) {
        System.out.println(StudentDataBase.getAllStudents().stream()
               .collect(Collectors.mapping(Student::getName,Collectors.toList())));
        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toSet())));
    }
}
