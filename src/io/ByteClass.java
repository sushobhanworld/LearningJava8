package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.zip.GZIPOutputStream;

public class ByteClass {
    public static void main(String[] args) {
        File file= new File("files/ints.bin.gz");
        try {
            OutputStream outputStream= new FileOutputStream(file);

            GZIPOutputStream gzipOutputStream= new GZIPOutputStream(outputStream);
            DataOutputStream dataOutputStream= new DataOutputStream(gzipOutputStream);
            //dataOutputStream.write(10);
            //dataOutputStream.writeUTF("Hello");
            IntStream.range(0,1000)
                            .forEach(i -> {
                                try {
                                    dataOutputStream.writeInt(i);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path path= Paths.get("files/ints.bin.gz");
        try {
            long size = Files.size(path);
            System.out.println(path+"Size :"+size);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
