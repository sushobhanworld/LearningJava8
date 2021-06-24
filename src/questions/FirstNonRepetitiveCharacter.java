package questions;

public class FirstNonRepetitiveCharacter {
    public static char firstNonRepetitive(String s){
        for(Character c: s.toCharArray()){
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return c;
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepetitive("abacabaabacaba"));
    }
}
