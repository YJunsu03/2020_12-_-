public class euler_1 {
    public static void main(String[] args) {
        int tsum=0;
        int fsum=0;

        for(int i=1; i<1000; i++){
            if(i%3 == 0) {
                tsum += i;
            } 
            else if(i%5 == 0) {
                fsum += i; 
            }
        }
        System.out.println(tsum + fsum);
    }
}
