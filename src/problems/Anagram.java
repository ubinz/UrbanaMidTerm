package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        String word1 = "MARY";
        String word2 = "ARMY";

        String  word3 = "CAT";
        String  word4 = "DOG";

        checkIfAnagram(word1, word2); // is Anagram
        checkIfAnagram(word3, word4); // not Anagram
    }

    public static void checkIfAnagram(String word1, String word2) {
        if (isAnagram(word1, word2) == true) {
            System.out.println("Is Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    public static boolean isAnagram(String word1,  String word2){
        if (word1.length() != word2.length()){
               return false;
        }
        char[] chars = word1. toCharArray();
        for (char c: chars){
            int index = word2.indexOf(c);
            if(index !=-1){
             word2 = word2.substring(0, index)+ word2.substring(index+1, word2.length());
             }else {
                return false;
                }
            }
            return word2.isEmpty();
        }
}

