package stream_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {
    public static void groupStudentByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void customizedGrouping() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.9 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1() {
        Map<Integer, Map<Object, List<Student>>> studentMapTwoLevel = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() >= 3.9 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(studentMapTwoLevel);
    }

    public static void twoLevelGrouping_2() {
        Map<Integer, Integer> studentMapTwoLevel = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.summingInt(Student::getNotebooks)));
        System.out.println(studentMapTwoLevel);
    }

    public static void twoLevelGrouping_3() {
        Map<String, Integer> stringIntegerMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.summingInt(Student::getNotebooks)));
        System.out.println(stringIntegerMap);
    }

    public static void threeArgumentGroupBy() {
        LinkedHashMap<String, Set<Student>> stringSetLinkedHashMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName,
                        LinkedHashMap::new, Collectors.toSet()));
        System.out.println(stringSetLinkedHashMap);
    }

    public static void main(String[] args) {
        //groupStudentByGender();
        //customizedGrouping();
        //twoLevelGrouping_1();
        threeArgumentGroupBy();
    }
}
