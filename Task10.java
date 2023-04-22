package JavaProject1;

public class Task10 {
    public static void main(String[] args) {
        /*10. Write a program to print out duplicate elements from
an Array of Strings?
         */

        String arr[]={"nice", "kind", "beautiful", "nice", "lovely"};

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    System.out.println("The duplicate element is "+ "'"+ arr[i]+ "'");
                }
                }
            }
        }
    }

