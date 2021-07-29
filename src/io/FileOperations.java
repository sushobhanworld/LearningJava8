package io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {
    public static void main(String[] args) throws Exception{
        File file = new File("files/data.txt");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getCanonicalFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getParent());
        System.out.println(file.getPath());


        //Path interface
        Path root= Paths.get("files");
        Path child = Paths.get("data.txt");
        Path resolved = root.resolve(child); //resolve concatenates the path
        Path sibling = root.resolveSibling(child); //
        System.out.println(resolved);
        System.out.println(sibling);
    }
}
