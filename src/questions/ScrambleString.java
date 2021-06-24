package questions;

import java.util.Arrays;

public class ScrambleString {
    public static boolean isScrambleString(String firstInput, String secondInput){
        char[] chars1= firstInput.toCharArray();
        char[] chars2= secondInput.toCharArray();
        boolean flag=true;

        if(firstInput.length()!= secondInput.length())
            return flag=false;
        Arrays.parallelSort(chars1);
        Arrays.parallelSort(chars2);

        System.out.println(chars1);
        System.out.println(chars2);

        for(int i=0;i<chars1.length;i++){
            if(chars1[i]!= chars2[i]){
                return flag=false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isScrambleString("india","ndiai"));
    }
}
