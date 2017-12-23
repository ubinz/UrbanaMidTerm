package math;

public class Fibonacci {
    public static void main(String[] args) {

            int n, a = 0, b = 0, c = 1;
            System.out.println("Fibonacci Series:");
            for(int i = 1; i <= 40; i++)//i<=40 declared in question
            {
                a=b;
                b=c;           //Fibonacci rules adding previous number with present number
                c=a + b;       //exm: 0+1=1, 1+1=2, 2+1=3,3+2=5,5+3=8 etc.
                System.out.println(a+" ");
            }
        }
    }


