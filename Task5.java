package JavaProject1;

public class Task5 {
    public static void main(String[] args) {
        /*5. Write a program to swap 2 numbers without a
temporary variable?
         */
        int a=4;
        int b=5;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping: ");
        System.out.println(" a = "+ a);
        System.out.println(" b= "+b);

    }
}
