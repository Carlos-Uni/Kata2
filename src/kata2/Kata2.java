package kata2;

import java.util.HashMap;
import java.util.Map;


/*
Version1
*/

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {1,9,3,52,78,0,63,95,10,52,6,8,4,3,9};
        Map<Integer,Integer> histogram = new HashMap();
        
        for(int key : data){
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : histogram.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
