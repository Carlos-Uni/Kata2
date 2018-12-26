package kata2;

import java.util.HashMap;
import java.util.Map;


/*
Version1
*/

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {1,9,3,52,78,0,63,95,10,52,6,8,4,3,9};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();

        
        for(Map.Entry<Integer, Integer> entry : histogr.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    
    }
}
