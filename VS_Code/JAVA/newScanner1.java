public class newScanner1 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Hello");

        a.append(" World");
        System.out.println(a);  // hello world

        //a.delete(6,7) 과 같음
        a.deleteCharAt(6);
        System.out.println(a);
    }
}
