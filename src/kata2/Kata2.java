package kata2;

import java.util.HashMap;
import java.util.Map;


/*
Version1
*/

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Carlos","Pepe","Alfredo","Rosa","María","Rosa","Carlos"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();

        
        for(Map.Entry<String, Integer> entry : histogr.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    
    }
}
