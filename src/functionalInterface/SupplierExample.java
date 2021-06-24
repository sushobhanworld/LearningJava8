package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierExample
{
    public static void main(String[] args) {
        Supplier<Student> studentSupplier= () ->{
            return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        };
        Supplier<List<Student>> listSupplier= StudentDataBase::getAllStudents;
        System.out.println(studentSupplier.get());
        System.out.println("List of students: "+listSupplier.get());

        Predicate<Student> p1= (s->s.getGpa()>=3.9);
        Predicate<Student> p2= (s->s.getGradeLevel()>=3);
        Function<List<Student>, Map<String,List<String>>> mapFunction= (students -> {

            return null;
        });
        System.out.println(StudentDataBase.getAllStudents().stream()
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Student::getName, Student::getActivities)));
                //.collect(Collectors.toMap((s1 ->s1.))));
    }
}
