package questions;

public class RemoveWhiteSpaces {
    static String removeSpaces(String s){
        StringBuilder stringBuilder= new StringBuilder();
        for(String s1: s.split(" ")){
            stringBuilder.append(s1);
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeSpaces("s u s h o b h a n"));
    }
}
