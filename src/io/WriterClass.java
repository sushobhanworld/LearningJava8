package io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class WriterClass {
    public static void main(String[] args) {
        Path path= Paths.get("files/some-text.txt");
        try {
            BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            PrintWriter printWriter= new PrintWriter(bufferedWriter);
            //printWriter.println("Hello World!");
            printWriter.printf("%d\n",12);
            printWriter.printf("%d %o %x\n",12,8,248);

            Calendar calendar= GregorianCalendar.getInstance();
            calendar.set(1969,6,20);
            printWriter.printf(Locale.US,"Man walked on moon: %1$tm 1$te 1$tY",calendar);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
