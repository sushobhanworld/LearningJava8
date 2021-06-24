package questions;

public class PalindromeString {
    public static boolean checkPalindromeString(String text){
        boolean flag=true;
        for(int i=0;i<text.length()/2;i++){
            if(text.charAt(i)!=text.charAt(text.length()-i-1))
                flag=false;
            return flag;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindromeString("madam"));
    }
}
