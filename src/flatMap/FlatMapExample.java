package flatMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        Employee john = new Employee("John Doe",30);
        Employee jane = new Employee("Jane Deer",25);
        Employee jack = new Employee("Jack Hill",40);
        Employee snow = new Employee("Snow White",22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);
        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        //print all the employees that works for the company
        List<Department> departments= new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        //from department get number of employees
        //now, there is one to many mappings
        //flat map method takes a function and returns  stream
        List<Employee> employeeList= departments
                .stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.toList());
                //.forEach(System.out::println);
        employeeList.forEach(System.out::println);

        //group by age group
        Map<Integer,List<Employee>> groupByAge= departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));
        groupByAge.forEach((k,v)-> System.out.println("Key :"+k+" , Value :"+v));

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1,e2)->e1.getAge()<e2.getAge()?e1:e2)
                .ifPresent(System.out::println);

        System.out.println(employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList()));

    }
}
