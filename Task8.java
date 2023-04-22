package JavaProject1;

public class Task8 {
    public static void main(String[] args) {
        /*
        8. Maximum and minimum number in the array?
         */
        int[] arr = {75, 68, 55, 73, 80, 90, 87};

        int maxNum = arr[0];
        int minNum=arr[0];
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
            if (num<minNum) {
                minNum=num;

            }
        }
        System.out.println("Maximum number is "+maxNum);
        System.out.println("Minimum number is "+minNum);
    }
}