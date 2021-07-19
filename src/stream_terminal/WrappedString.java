package stream_terminal;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class WrappedString {
    private String s;
    public WrappedString(String s){
        this.s=s;
    }

    public static void main(String[] args) {
        HashSet<Object> hs= new LinkedHashSet<>();
        WrappedString ws1= new WrappedString("aardvark");
        WrappedString ws2= new WrappedString("aardvark");
        String s1= new String("aardvark");
        String s2= new String("aardvark");
        hs.add(ws1);
        System.out.println(ws1);
        hs.add(ws2);
        System.out.println(ws2);
        hs.add(s1);
        System.out.println(s1);
        hs.add(s2);
        System.out.println(s2);
        System.out.println(hs);
        System.out.println(hs.size());
    }
}
