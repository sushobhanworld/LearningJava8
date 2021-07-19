package stream_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAverageExample
{
    public static int sum()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .mapToInt(Student::getNotebooks)
                .sum();
    }

    public static Double average()
    {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNotebooks));
    }

    public static void main(String[] args) {
        System.out.println("Total number of notebooks :"+sum());
        System.out.println("Average number of notebooks :"+average());
    }
}
