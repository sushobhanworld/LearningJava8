package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample
{
    public static int performMultiplication(List<Integer> list)
    {
        return list.stream()
                .reduce(1,(a,b)->a*b);
    }

    public static int performSum(List<Integer> list)
    {
        return list.stream()
                .reduce(0,(a,b)->a+b);
    }

    public static Optional<Integer> performSumWithoutIdentity(List<Integer>list)
    {
        return list.stream()
                .reduce((a,b)->a+b);
    }

    public static Optional<Student> getHighestGPAStudent()
    {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->{
                    if(s1.getGpa()>s2.getGpa())
                    {
                        return s1;
                    }
                    else
                    {
                        return s2;
                    }
                });
    }
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,3,5,7);
        List<Integer> integerList1= new ArrayList<>();
        System.out.println(performMultiplication(integerList));
        System.out.println(performSum(integerList));

        Optional<Integer> result = performSumWithoutIdentity(integerList);
        Optional<Integer> result1 = performSumWithoutIdentity(integerList1);
        System.out.println(result.get());
        System.out.println(result.isPresent());
        System.out.println(result1.isPresent());
        //System.out.println(result1.get());

        System.out.println("***************************");
        if(getHighestGPAStudent().isPresent())
        {
            System.out.println(getHighestGPAStudent());
        }
    }
}
