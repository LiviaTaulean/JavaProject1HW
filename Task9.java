package JavaProject1;

public class Task9 {
    public static void main(String[] args) {
        /*
        9. Write a java program to find the second largest
number in the array?
         */
        int[] arr = {75, 68, 55, 73, 80, 90, 87};
        int largest=0;
        int secLarg=0;

        for(int i=0; i< arr.length; i++){
            if(arr[i]>largest){
                secLarg=largest;
                largest=arr[i];
            } else if (arr[i]>secLarg && arr[i]!=largest) {
                secLarg=arr[i];

            }
        }
        System.out.println("The second largest number is "+secLarg);
    }
}
