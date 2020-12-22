import java.util.Scanner;

public class Training01 {
    public static void main(String[] args) {
        int s = 0;
        System.out.println(jaejun(s));

    }

    public static int jaejun(int jun) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int sum=0;
        for(int i=1; i<input; i++){
            sum = i+input;
            jun += sum;
            System.out.println(jun);
        }
        return jun;
    }
        
}