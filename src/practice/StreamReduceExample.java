package practice;

import data.Student;
import data.StudentDataBase;

import java.util.*;

public class StreamReduceExample {
    //Reduce is used for sum, multiply for a set of numbers
    public static Optional<Student> findMaxGrade() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> s1.getGradeLevel() > s2.getGradeLevel() ? s1 : s2);
    }

    public static Integer findNoOfNoteBooksForFemaleHavingGradeMoreThan3() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNotebooks)
                .reduce(0, (a, b) -> a + b);
    }

    public static Integer findHighestGradeAmongFemale() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getGradeLevel)
                .sorted(Comparator.reverseOrder()).findFirst()
                .orElse(null);
    }

    public static Integer findSecondHighestGradeAmongFemale() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getGradeLevel)
                .sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .orElse(null);
    }

//    public static String findFemaleNameWhoGotHighestGrade(){
//        return StudentDataBase.getAllStudents()
//                .stream()
//                .filter(student -> student.getGender().equals("female"))
//                .map(Student::getGradeLevel)
//                .sorted(Comparator.reverseOrder())
//
//    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(integers.stream()
                .reduce(1, (a, b) -> a * b));

        Optional<Integer> result = integers.stream().reduce((a, b) -> a * b);
        System.out.println(result.isPresent());
        System.out.println(result.get());

//        Optional<Integer> result1 = emptyList.stream().reduce((a, b) -> a * b);
//        System.out.println(result1.isPresent());
//        System.out.println(result1.get());

        System.out.println(findNoOfNoteBooksForFemaleHavingGradeMoreThan3());
        System.out.println(findHighestGradeAmongFemale());
        System.out.println(findSecondHighestGradeAmongFemale());
    }
}
