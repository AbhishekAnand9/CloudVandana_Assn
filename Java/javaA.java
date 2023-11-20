
import java.util.Random;

public class javaA {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        javaA(array);

        // Printing the shuffled array

        System.out.println("Shuffled Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    // using Fisher-Yates shuffle algorithm
    public static void javaA(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int randomIndex = random.nextInt(i + 1);

            //swap
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
