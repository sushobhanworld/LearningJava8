package functionalInterface;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceExample
{
    private static int NumberOfNOTEBOOKs()
    {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNotebooks)
                //.reduce(0,(a,b)->a+b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(NumberOfNOTEBOOKs());
    }
}
