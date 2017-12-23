package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {
    static  int factorial(int n){
        if (n==0)//Conditional statements
         return 1;
        else
            return (n * factorial(n-1));
    }

    public static void main(String[] args) {
        int i,fc=1;
        int number=5;  // It is the to calculate factorial
        fc = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fc);
    }
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */





    }

