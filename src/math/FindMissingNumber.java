package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    int []array = new int []{10, 2, 1, 4, 5, 3, 7, 8, 6};
    // method to calculate sum of n number
    static int sumOfNumbers (int n ){
      int sum = (n* (n+1))/2;
      return sum;
    }
    //method to calculate sum of all elements of array
    static int sumOfElements(int [] array) {
        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            sum = sum + array[i];
        }
         return sum;
    }
    public static void main(String[] args) {
        int n = 10;
        int[]array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        //stp1
        int sumOfNumbers = sumOfNumbers(n);
        //stp2
        int sumOfElements = sumOfElements(array);
        //stp3
        int missingNumber = sumOfNumbers - sumOfElements;
        System.out.println("missing number is = " + missingNumber);
    }
}


        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */



