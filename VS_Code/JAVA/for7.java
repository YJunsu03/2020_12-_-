import java.util.Scanner;

public class for7 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        for(int i=1; i<=num; i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            
            int C = A + B;

            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + C);
        }
    } 
}
