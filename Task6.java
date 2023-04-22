package JavaProject1;

public class Task6 {
    public static void main(String[] args) {
        /*6. Write a java program to check whether a given
number is prime or not?*/
        int num=11;
        boolean prime=true;
        if(num>1){
            for(int i=2; i<num;i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println(num+" is a prime number");
        }else {
            System.out.println(num+ " is not a prime number");
        }


    }
}
