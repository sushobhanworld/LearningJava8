package questions;

import java.util.Arrays;

public class SortSentence {
    public static String sortSentence(String s) {
        String[] strings = s.split(" ");
        Arrays.sort(strings, (o1, o2) -> {
            if (o1.charAt(o1.length() - 1) < o2.charAt(o2.length() - 1))
                return -1;
            else
                return 1;
        });
        StringBuilder str = new StringBuilder();
        for (String st : strings) {
            String temp = st.substring(0, st.length() - 1);
            str.append(temp).append(" ");
        }
        return str.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }
}
