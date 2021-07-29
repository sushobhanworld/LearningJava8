package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReaderClass {
    public static void main(String[] args) {
        File file= new File("files/data.txt");
        Path path= Paths.get("files/data.txt");
        try(Reader reader= new FileReader(file)){
            //Argument of try should be auto closable
            //BufferedReader br= new BufferedReader(reader);
            BufferedReader br= Files.newBufferedReader(path);
            br.lines()
                    .forEach(System.out::println);
            //String line= br.readLine();
//            while (line!=null){
//                System.out.println(line);
//                line=br.readLine();
//            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
