package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SerialClassWriteObjectOverride {
    public static void main(String[] args) {
        String fileName= "files/person-write-object.bin";
        File file= new File(fileName);

        Person p1= new Person("Linda",32);
        Person p2= new Person("David",27);

        List<Person> people= new ArrayList<>();
        people.add(p1);
        people.add(p2);

        try {
            OutputStream outputStream= new FileOutputStream(file);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(outputStream);
            //objectOutputStream.writeObject(p1);
            //objectOutputStream.writeObject(p2);
            objectOutputStream.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("person.bin :"+ Files.size(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
