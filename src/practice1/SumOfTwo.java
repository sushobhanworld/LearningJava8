package practice1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {
    public static void main(String[] args) {
        int[] a= {2,3,7,4,8};
        System.out.println(Arrays.toString(getSum(a)));
    }

    public static int[] getSum(int[] a){
        int expectedSum =7;
        Map<Integer, Integer> visitedMap= new HashMap<>();
        for (int i=0;i<a.length;i++){
            int delta= expectedSum-a[i];
            if(visitedMap.containsKey(delta)){
                return new int[] {i, visitedMap.get(delta)};
            }
            else{
                visitedMap.put(a[i], i);
            }
        }
        return new int[]{-1,-1};
    }
}
