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
        
        for(int i = 0; i < data.length; i++){
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+ 1);
            }else{
                histogram.put(data[i], 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : histogram.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
