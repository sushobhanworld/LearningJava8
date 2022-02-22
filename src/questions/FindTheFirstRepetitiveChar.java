package questions;

import java.util.HashSet;

public class FindTheFirstRepetitiveChar {
    public static char findFirstRepeatChar(String text) {
        char[] chars = text.toCharArray();
        char expectedChar = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return chars[i];
                }
            }
        }
        return expectedChar;
    }

    public static int firstDuplicate(int[] a) {
        HashSet<Integer> ch = new HashSet<>();
        for (int num : a) {
            if (ch.contains(num))
                return num;
            ch.add(num);
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(findFirstRepeatChar("hello my name is anjana"));
        System.out.println(firstDuplicate(new int[]{2, 1, 3, 5, 3, 2}));
    }
}
