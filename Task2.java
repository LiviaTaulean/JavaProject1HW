package JavaProject1;

public class Task2 {
    public static void main(String[] args) {
        /*2. Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array. */
int [] numbers= {60, 70, 33, 88, 52, 110, 21, 47};
int sum=0;

for(int num:numbers){
    sum=sum+num;
}
        System.out.println(sum);
    }
}
