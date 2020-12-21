import java.util.Scanner;

public class for10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int X = in.nextInt();
        int arr[] = new int[N]; // arr에 배열 크기 = N 
        
        for (int i = 0; i < N; i++) { //N 보다 작을때까지 반복
            arr[i] = in.nextInt(); //N 의 수 만큼 입력
        }

        in.close(); //
      
        int i;
        for (i = 0; i < N; i++) {
            if (arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }


        
    }
}


