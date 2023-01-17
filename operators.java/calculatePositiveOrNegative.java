
import java.util.Scanner;

public class calculatePositiveOrNegative{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Positve");
        }
        else {
            System.out.println("Negative");
        }

        
    }
}