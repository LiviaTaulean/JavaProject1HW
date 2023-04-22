package JavaProject1;

public class Task1 {
    public static void main(String[] args) {
/*1. Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.
 */
        int[] temperature = {75, 68, 55, 73, 80, 90, 87};

        int highestTemperature = temperature[0];
        for (int num : temperature) {
            if (num > highestTemperature) {
                highestTemperature = num;
            }

        }
        System.out.println(highestTemperature);

    }
}
