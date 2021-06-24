package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample
{
    static  Predicate<Student> p1= (student -> student.getGradeLevel()>=3);
    static  Predicate<Student> p2= (student -> student.getGpa()>=3.9);

    public static void filterStudentByGradeLevel()
    {
        System.out.println("filterStudentByGradeLevel.....");
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.test(student))
                System.out.println(student);
        });
    }

    public static void filterStudentByGPA()
    {
        System.out.println("filterStudentByGPA.....");
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p2.test(student))
                System.out.println(student);
        });
    }

    public static void filterStudentByGradeLevelAndGPA()
    {
        System.out.println("filterStudentByGradeLevelAndGPA......");
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.and(p2).test(student))
                System.out.println(student);
        });
    }
    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGPA();
    }
}
