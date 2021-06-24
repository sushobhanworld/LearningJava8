package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample
{
    public static void nameAndActivities(){
        BiConsumer<String, List<String>> studentListBiConsumer= (name, activities) -> System.out.println(name+" "+activities);
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(s -> studentListBiConsumer.accept(s.getName(),s.getActivities()));
    }
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer= (a,b) -> {
            System.out.println("a :"+a+" ,b :"+b);
        };
        biConsumer.accept("java7", "java8");

        BiConsumer<Integer, Integer> multiply= (a,b) ->{
            System.out.println("Multiply :"+(a*b));
        };
        BiConsumer<Integer, Integer> divide= (a,b) ->{
            System.out.println("Multiply :"+(a/b));
        };
        multiply.andThen(divide).accept(10,5);
        nameAndActivities();
    }
}
