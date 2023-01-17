import java.net.SocketTimeoutException;
import java.util.Scanner;

public class butterfly {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        // Upper Half
        for(int i=1; i<=a; i++){

            // First Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // Spaces
            int s= 2*(a-i);
                for(int j=1; j<=s; j++){
                    System.out.print(" ");
                }
                // Second Part
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
            
          System.out.println(" ");
        }
        // Lower Half
        for(int i=a; i>=1; i--){

            // First Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // Spaces
            int s= 2*(a-i);
                for(int j=1; j<=s; j++){
                    System.out.print(" ");
                }
                // Second Part
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
            
          System.out.println(" ");
        }
        
    
    }
}
