package generics;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Object object= new Object();
        String myVar= "hello";
        object= myVar;

        Employee employee= new Employee();
        Accountant accountant= new Accountant();
        employee=accountant;

        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee());
        List<Accountant> accountants= new ArrayList<>();
        accountants.add(new Accountant());
        //employees= accountants; //not possible because types are different

        List<?> employees2= new ArrayList<>();
        List<Accountant> accountants2= new ArrayList<>();
        employees2=accountants2; //wild character allows because ? can be accountant

        //Upper bound
        ArrayList<? extends Employee> employees3= new ArrayList<>();
        ArrayList<Accountant> accountants3= new ArrayList<>();
        ArrayList<String> stringAccountants= new ArrayList<>();

        employees3= accountants3; //only employee or any child of employee class
        //employees3=stringAccountants; //not allowed as String class is not child of Employee class

        //Lower bound
        ArrayList<? super Employee> employees4= new ArrayList<>();
        ArrayList<Accountant> accountants4= new ArrayList<>();
        ArrayList<String> stringAccountants1= new ArrayList<>();
        //employees4=accountants4; //only employee or its parent class can make it in lower bound
        //employees4=stringAccountants1; // String class doesn't come in the hierarchy of Employee class

        makeEmployeeWork(employees);
        makeEmployeeWork1(accountants);

        //makeEmployeeWork2(accountants);
    }

    private static void makeEmployeeWork(List<Employee> employees){
        employees.forEach(Employee::work);
    }

    private static void makeEmployeeWork1(List<? extends Employee> employees){
        //employees.forEach(Employee::work);
        for(Employee employee:employees){
            employee.work();
        }
    }
    // if we delete the work method in Employee class and try to access work method of child Account class

    private static void makeEmployeeWork2(List<? super Employee>employees){
        employees.forEach((a)-> {
            //a.work();
        });
    }

}
