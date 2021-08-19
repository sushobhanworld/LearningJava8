package questions;

import java.io.*;
import java.util.*;

public class H implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//        T2 obj= new T2();
//        obj.i=1;
//        obj.i=2;
//        obj.display();

        List<Integer> a= new ArrayList<>();
        a.add(1);
        a.add(2);
        System.out.println(a);

        Map<String, Integer> map= new HashMap<>();




        System.out.println(System.getProperty("user.dir"));

        InputStream inputStream= new FileInputStream("demo.txt");
        Reader inputStreamReader= new InputStreamReader(inputStream,"UTF-8");

        int data= inputStreamReader.read();
        while(data !=-1){
            char theChar= (char) data;
            data= inputStreamReader.read();
            System.out.println(data);
        }
        inputStreamReader.close();
    }
}
