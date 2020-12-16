import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Training01 {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String etc[] = br.readLine().split(" ");

         int A = Integer.parseInt(etc.nextToken());
         int B = Integer.parseInt(etc.nextToken());

        System.out.println(A+B);

    }

}
