package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SteamFlatMapExample
{
    static Predicate<Student> studentPredicateFemale= (s -> s.getGender().equals("female"));
    public static List<String> printStudentActivites()
    {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static List<List<String>> printStudentActivitesUsingMap()
    {
        List<List<String>> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                //.flatMap(List::stream)
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static long printStudentActivitesCount()
    {
        long studentActivitiesCount = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return studentActivitiesCount;
    }

    public static List<Student> filterStudentFemale()
    {
        return StudentDataBase.getAllStudents().stream()
                .filter(studentPredicateFemale)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivites());
        System.out.println(printStudentActivitesUsingMap());
        System.out.println(printStudentActivitesCount());
        System.out.println(filterStudentFemale());
    }
}
