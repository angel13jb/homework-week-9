package week9;

import java.util.HashMap;
import java.util.Map;

public class Program09 {
    //create a hashmap object called people store string,integer value
    public static void main(String[] args) {
        Map<String,Integer>people=new HashMap<>();
        //create list of people name
        people.put("Jalpa",1);
        people.put("Kinjal",2);
        people.put("Megha",3);
        people.put("Shilpa",4);
        people.put("Neha",5);
        people.put("Devanshi",6);
        //itereate value of people by using for each
        for (Map.Entry<String,Integer>peopleName: people.entrySet()) {
            System.out.println(peopleName);
        }

    }
}
