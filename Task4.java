package JavaProject1;

public class Task4 {
    public static void main(String[] args) {
        /*4. Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.
         */
        int[][] arr2D = {{34, 87, 64, 55, 40,},
                {2, 7, 1, 19, 20},
                {111, 234, 555, 744, 980}
        };
        int evenSum = 0;
        int oddSum = 0;
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                if (arr2D[row][col] % 2 == 0) {
                    evenSum += arr2D[row][col];
                } else {
                    oddSum += arr2D[row][col];
                }
            }
        }
        System.out.println("Sum of even numbers is "+evenSum);
        System.out.println("Sum of odd numbers is "+oddSum);
    }
}
