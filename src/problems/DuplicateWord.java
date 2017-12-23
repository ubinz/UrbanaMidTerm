package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String item[] = st.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String t : item) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }

        }
        Set<String> keys = map.keySet();
        for (String Key : keys) {
            System.out.println(Key);
            System.out.println(map.get(Key));
        }

    }

}
/*

         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */




