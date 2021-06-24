package practice1;

public class ReverseString {
    static String reverseString(String text){
        char[] c = text.toCharArray();
        StringBuilder stringBuilder= new StringBuilder();
        for(int i=c.length-1;i>=0;i--){
            stringBuilder.append(c[i]);
        }
        return stringBuilder.toString();
    }

    static String reverseEachWord(String s){
        String[] s1= s.split(" ");
        StringBuilder stringBuilder= new StringBuilder();
        for(String s2:s1){
            stringBuilder.append(reverseString(s2)+" ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("sushobhan"));
        System.out.println(reverseEachWord("my name is sushobhan"));
    }
}
