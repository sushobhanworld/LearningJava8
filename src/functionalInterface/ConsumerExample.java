package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample
{
    static Consumer<Student> studentConsumer= (s) -> System.out.println(s);
    static Consumer<Student> studentConsumerName= (s) -> System.out.print(s.getName());
    static Consumer<Student> studentConsumerActivities= (s) -> System.out.println(s.getActivities());

    public static void printStudent()
    {
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
    }

    public static void printNameAndActivities()
    {

        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumerName.andThen(studentConsumerActivities)); //consumer chaining
    }

    public static void printNameAndActivitiesUsingCondition()
    {
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9)
            {
                studentConsumerName.andThen(studentConsumerActivities).accept(student);
            }
        }));
    }
    public static void main(String[] args) {
        Consumer<String> consumer= (s -> System.out.println(s.toUpperCase()));
        consumer.accept("sushobhan");
        printStudent();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
