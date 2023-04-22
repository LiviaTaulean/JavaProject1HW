package JavaProject1;

public class Task3 {
    public static void main(String[] args) {
        /*3. Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.
         */
        int [][] arr2D={{34, 87, 64, 55, 40,},
                {2, 7, 1, 19, 20},
                {111, 234, 555, 744, 980}
        };
       for (int []numbers:arr2D){
           for(int evenNumbers: numbers ){
               if(evenNumbers%2==0){
                   System.out.println(evenNumbers);
               }
           }
       }

    }
}
