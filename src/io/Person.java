package io;

import java.io.*;

public class Person implements Externalizable {
    private String name;
    private int age;

//    private void writeObject(ObjectOutputStream objectOutputStream) throws Exception{
//        DataOutputStream dataOutputStream= new DataOutputStream(objectOutputStream);
//        dataOutputStream.writeUTF(name +"::"+age);
//    }

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        String pk= name +"::" + age;
        out.write(pk.getBytes());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
