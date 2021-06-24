package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample
{
    static Predicate<Student> studentDataBasePredicate= (s -> s.getGpa() >=3.9);
    //static Consumer<Student> studentConsumer= (s -> s.getGpa()>3); //wrong statement
    static Predicate<Student> studentPredicate= (s -> s.getGradeLevel()>3);
    static Function<List<Student>, Map<String,Double>> studentFunction= (students ->{
        //need to write the logic to get the name and gpa
        Map<String,Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if(studentDataBasePredicate.test(student))
            {
                studentGradeMap.put(student.getName(),student.getGpa());
            }
        });
        return studentGradeMap;
    });

    static Function<List<Student>, Map<String,Integer>> listMapFunction= (students ->{
        Map<String, Integer> map= new HashMap<>();
        students.forEach(student ->{
            if(studentPredicate.test(student))
            {
                map.put(student.getName(),student.getGradeLevel());
            }
        });
        return map;
    });
    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
