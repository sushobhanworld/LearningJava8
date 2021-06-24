package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamFindFirstAnyExample
{
    public static Optional<Student> findAnyStudent()
    {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent()
    {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=4.1)
                .findFirst();
    }
    public static void main(String[] args) {
        //Return type of findFirst() and findAny() is Optional
        if(findAnyStudent().isPresent())
            System.out.println("Find any :"+findAnyStudent().get());
        else
            System.out.println("Student not found");
        if(findFirstStudent().isPresent())
            System.out.println("Find first :"+findFirstStudent().get());
        else
            System.out.println("Student not found");
    }
}
