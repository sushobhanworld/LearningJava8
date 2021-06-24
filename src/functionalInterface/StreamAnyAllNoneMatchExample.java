package functionalInterface;

import data.StudentDataBase;

public class StreamAnyAllNoneMatchExample
{
    public static boolean allMatch()
    {
        return StudentDataBase.getAllStudents().stream()
                //.allMatch(student -> student.getGpa()>=3.9);
                .allMatch(student -> student.getGpa()>=3.5);
    }

    public static boolean anyMatch()
    {
        return StudentDataBase.getAllStudents().stream()
                //.allMatch(student -> student.getGpa()>=3.9);
                .anyMatch(student -> student.getGpa()>=4.0);
    }

    public static boolean noneMatch()
    {
        return StudentDataBase.getAllStudents().stream()
                //.allMatch(student -> student.getGpa()>=3.9);
                .noneMatch(student -> student.getGpa()>=4.0);
    }
    public static void main(String[] args) {
        System.out.println("All Match :"+allMatch());
        System.out.println("Any match :"+anyMatch());
        System.out.println("None match is opposite of All Match :"+noneMatch());
    }
}
