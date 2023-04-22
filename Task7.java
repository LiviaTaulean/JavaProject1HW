package JavaProject1;

public class Task7 {
    public static void main(String[] args) {
        /*
        7. Write a Java Program to print the first 10 numbers of
Fibonacci series.
         */

        int n=10;
        int  a=0;
        int b=1;
        int s;

        for(int i=1; i<=n; i++){
            s=a+b;
            System.out.println(s+" ");
            a=b;
            b=s;

        }


    }
}
