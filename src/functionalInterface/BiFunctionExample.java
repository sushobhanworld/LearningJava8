package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample
{
    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction= ((students,studentPredicate) ->{
       Map<String, Double> map= new HashMap<>();
       students.forEach(student -> {
           if(studentPredicate.test(student))
           {
               map.put(student.getName(),student.getGpa());
           }
       });
       return map;
    });
    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), (p->p.getGpa()>=3.9)));
    }
}
