import java.util.Scanner;

public class SolidRombhus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        for (int i=1; i<=a; i++) {
            //Spaces 
            for (int j=1; j<=a-i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j=1; j<=5; j++) {
            System.out.print("*");
            }
            System.out.println();
        }
       

    }
}
