
//  Average OF 3 numbers
 
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the first number:");
           float A = sc.nextFloat();
           System.out.println("Enter the second number:");
           float B = sc.nextFloat();
           System.out.println("Enter the third number:");
           float C = sc.nextFloat();
           
           float average = (A + B + C) / 3;
           System.out.println("The average of A, B, C is :" + average);
    }
    }
}
