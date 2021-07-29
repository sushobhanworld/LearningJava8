package generics;

class Person implements Comparable<Person> {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.getName());
        //return Integer.compare(age,p.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class P1 {
    private static <T extends Comparable<T>> T calculateMin(T num1, T num2){
        if(num1.compareTo(num2)<0)
            return num1;
        return num2;
    }
    public static void main(String[] args) {
        System.out.println(calculateMin(2,3));
        System.out.println(calculateMin("sushobhan","kumar"));
        System.out.println(calculateMin(new Person("Sdam",45),new Person("Kevin",78)));
    }
}
