package stream_terminal;

import java.util.LinkedList;

public class W {
    public static void main(String[] args) {
        LinkedList<Integer> i= new LinkedList<>();
        i.add(5);
        i.add(1);
        i.add(10);
        System.out.println(i);
        AAA t = new AAA() {
            public int getNum()

            {
                return 22;
            }
        };
        AAA.Bar f = t.new Bar() {
            public int getNum() {
                return 57;
            }

        };
        System.out.println(f.getNum()+" "+t.getNum());
    }
}
