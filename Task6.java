
import java.util.Random;

public class Task6 {

    public static void main(String[] args) {
        ArrayOperation array = new ArrayOperation();
        array.calculateAverage();
        array.calculateMinMax();
    }
}

class ArrayOperation {

    private Random random = new Random();
    private int[] numbers = new int[10];
    private double average = 0;
    private int minimum;
    private int maximum;

    public void generateRandomArray() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(0, 100) + 1;
        }
        System.out.print("The numbers from the array are: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    public void calculateAverage() {
        generateRandomArray();
        int sum=0;
        for (int number : numbers) {
            sum +=number;
        }
        average = (double) sum / numbers.length;
        System.out.println("The average is: " + average);
    }

    public void calculateMinMax() {
        minimum = numbers[0];
        maximum = numbers[0];
        for (int number : numbers) {
            if  (maximum<number)
            maximum = number;
            if  (minimum>number)
            minimum = number;
        }
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}
