
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        double quotient;
        double prod;
        double diff;
        double sum;
        Scanner keyScanner = new Scanner(System.in);
        System.out.print("Enter the first number: " );
        if(keyScanner.hasNextDouble())
        x = keyScanner.nextDouble();
        else
        System.out.printf("Error, number invalid! %n");
        System.out.print("Enter the second number: ");
        if(keyScanner.hasNextDouble())
        y = keyScanner.nextDouble();
        else
        System.out.printf("Error, number invalid! %n");
        sum = x+y;
        diff = x-y;
        prod = x*y;
        quotient = x/y;
        System.out.println("Results: ");
        System.out.printf("Sum      %.3f%n", sum);
        System.out.printf("Difference       %.3f%n", diff);
        System.out.printf("Product      %.3f%n", prod);
        if(y!=0){
        System.out.printf("Quotient     %.3f%n", quotient);
        }
        else{
        System.out.printf("Division with 0 it's impossible!");
        return;
        }
        keyScanner.close();
    }
}